package week4;

public class Week4 {

	public static void main(String[] args) {
		// 1. Create an array of int called ages that contains the following values: 3,
		// 9, 23, 64, 2, 8, 28, 93.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };

		// a. Programmatically subtract the value of the first element in the array from
		// the value in the last element of the array (i.e. do not use ages[7] in your
		// code). Print the result to the console.
		int difference = ages[ages.length - 1] - ages[0]; // use the length property to get the last index
		System.out.println("The difference between the first and the last element of ages is " + difference);

		// b. Create a new array of int called ages2 with 9 elements (ages2 will be
		// longer than the ages array, and have more elements).
		int[] ages2 = { 5, 12, 17, 55, 24, 18, 34, 42, 76 };

		// i. Make sure that there are 9 elements of type int in this new array.
		System.out.println("The length of ages2 is " + ages2.length);

		// ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the
		// value of the first element in the new array ages2 from the last element of
		// ages2).
		int difference2 = ages2[ages2.length - 1] - ages2[0]; // use the length property to get the last index
		System.out.println("The difference between the first and the last element of ages2 is " + difference2);

		// iii. Show that using the index values for the elements is dynamic (works for
		// arrays of different lengths).
		System.out.println(
				"The difference between the first and the last element of any array is the last element minus the first element");

		// c. Use a loop to iterate through the array and calculate the average age.
		// Print the result to the console.
		int sum = 0; // initialize a variable to store the sum of the ages
		for (int age : ages) { // use a for-each loop to iterate through the array
			sum += age; // add each age to the sum
		}
		double average = (double) sum / ages.length; // calculate the average by dividing the sum by the length
		System.out.println("The average age is " + average);

		// 2. Create an array of String called names that contains the following values:
		// “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		// a. Use a loop to iterate through the array and calculate the average number
		// of letters per name. Print the result to the console.
		int totalLetters = 0; // initialize a variable to store the total number of letters
		for (String name : names) { // use a for-each loop to iterate through the array
			totalLetters += name.length(); // add the length of each name to the total
		}
		double averageLetters = (double) totalLetters / names.length; // calculate the average by dividing the total by
																		// the length
		System.out.println("The average number of letters per name is " + averageLetters);

		// b. Use a loop to iterate through the array again and concatenate all the
		// names together, separated by spaces, and print the result to the console.
		String allNames = ""; // initialize a variable to store the concatenated names
		for (int i = 0; i < names.length; i++) { // use a for loop to iterate through the array
			allNames += names[i]; // add each name to the concatenated string
			if (i < names.length - 1) { // if it is not the last name
				allNames += " "; // add a space after the name
			}
		}
		System.out.println("All the names are " + allNames);

		// 3. How do you access the last element of any array?
		// You can access the last element of any array by using the length property of
		// the array and subtracting one from it. For example, if the array is called
		// arr, then the last element is arr[arr.length - 1].

		// 4. How do you access the first element of any array?
		// You can access the first element of any array by using the index zero. For
		// example, if the array is called arr, then the first element is arr[0].

		// 5. Create a new array of int called nameLengths. Write a loop to iterate over
		// the previously created names array and add the length of each name to the
		// nameLengths array.
		int[] nameLengths = new int[names.length]; // create a new array of int with the same length as the names array
		for (int i = 0; i < names.length; i++) { // use a for loop to iterate over the names array
			nameLengths[i] = names[i].length(); // assign the length of each name to the corresponding index in the
												// nameLengths array
		}

		// 6. Write a loop to iterate over the nameLengths array and calculate the sum
		// of all the elements in the array. Print the result to the console.
		int sumOfLengths = 0; // initialize a variable to store the sum of the lengths
		for (int length : nameLengths) { // use a for-each loop to iterate over the nameLengths array
			sumOfLengths += length; // add each length to the sum
		}
		System.out.println("The sum of all the name lengths is " + sumOfLengths);
	}

	// 7. Write a method that takes a String, word, and an int, n, as arguments and
	// returns the word concatenated to itself n number of times. (i.e. if I pass in
	// “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String repeatWord(String word, int n) {
		String result = ""; // initialize a variable to store the result
		for (int i = 0; i < n; i++) { // use a for loop to repeat the word n times
			result += word; // concatenate the word to the result
		}
		return result; // return the result
	}

	// 8. Write a method that takes two Strings, firstName and lastName, and returns
	// a full name (the full name should be the first and the last name as a String
	// separated by a space).
	public static String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName; // return the first name and the last name separated by a space
	}

	// 9. Write a method that takes an array of int and returns true if the sum of
	// all the ints in the array is greater than 100.
	public static boolean isSumGreaterThan100(int[] arr) {
		int sum = 0; // initialize a variable to store the sum of the array
		for (int num : arr) { // use a for-each loop to iterate over the array
			sum += num; // add each number to the sum
		}
		return sum > 100; // return true if the sum is greater than 100, false otherwise
	}

	// 10. Write a method that takes an array of double and returns the average of
	// all the elements in the array.
	public static double getAverage(double[] arr) {
		double sum = 0; // initialize a variable to store the sum of the array
		for (double num : arr) { // use a for-each loop to iterate over the array
			sum += num; // add each number to the sum
		}
		return sum / arr.length; // return the sum divided by the length of the array
	}

	// 11. Write a method that takes two arrays of double and returns true if the
	// average of the elements in the first array is greater than the average of the
	// elements in the second array.
	public static boolean isFirstAverageGreater(double[] arr1, double[] arr2) {
		return getAverage(arr1) > getAverage(arr2); // return true if the average of the first array is greater than the
													// average of the second array, false otherwise
	}

	// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
	// a double moneyInPocket, and returns true if it is hot outside and if
	// moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50; // return true if both conditions are true, false otherwise
	}

	// 13. Create a method of your own that solves a problem. In comments, write
	// what the method does and why you created it.
	// This method takes a String, sentence, and returns the number of words in it.
	// I created this method because it can be useful for counting words in a text
	// or a paragraph.
	public static int countWords(String sentence) {
		int count = 0; // initialize a variable to store the word count
		boolean isWord = false; // initialize a boolean flag to indicate if a word is being processed
		for (int i = 0; i < sentence.length(); i++) { // use a for loop to iterate over the characters in the sentence
			char c = sentence.charAt(i); // get the current character
			if (Character.isLetterOrDigit(c)) { // if the character is a letter or a digit
				isWord = true; // set the flag to true
			} else if (isWord) { // if the character is not a letter or a digit, and the flag is true
				count++; // increment the word count
				isWord = false; // reset the flag to false
			}
		}
		if (isWord) { // if the flag is still true at the end of the sentence
			count++; // increment the word count
		}
		return count; // return the word count
	}

}
