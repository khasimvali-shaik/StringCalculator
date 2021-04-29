package com.test.calculator;

public class StringCalculator {
	// this is to count howmany times add() called
	public static int count = 0;

	// This is a mehtod that returns addition of a given string
	public int add(String numbers) {

		// Calling getCalledCount() to get count
		int calledCount = getCalledCount();

		int result = 0;
		if (numbers == "")
			return 0;
		
		// will replace all the non digit numbers with space
		numbers = numbers.replaceAll("[^0-9]", " ");
		
		// This replaces a space which has more than one space
		numbers = numbers.replaceAll(" +", " ");
		numbers = numbers.trim();
		
		// converting the numbers string into array
		String[] items = numbers.split(" ");

		// getting the result from all the digits
		for (int i = 0; i < items.length; i++) {

			// Igonores if the numbers are greater than 1000
			if (Integer.parseInt(items[i]) <= 1000) {
				try {
					result += Integer.parseInt(items[i]);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	public static int getCalledCount() {

		return count++;
	}

}
