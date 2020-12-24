//  CodeCamp.java - CS314 Assignment 1

/*  Student information for assignment:
 * 
 *  replace <NAME> with your name.
 *
 *  On my honor, Ayush Patel, this programming assignment is my own work
 *  and I have not provided this code to any other student.
 *
 *  Name: Ayush Patel
 *  email address: patayush01@utexas.edu
 *  UTEID: ap55837
 *  Section 5 digit ID: 50865
 *  Grader name: Tony
 *  Number of slip days used on this assignment: 0
 */

import java.util.Arrays;
import java.util.Random;

public class CodeCamp {

	/**
	 * Determine the Hamming distance between two arrays of ints. Neither the
	 * parameter <tt>aData</tt> or <tt>bData</tt> are altered as a result of
	 * this method.<br>
	 * 
	 * @param aData != null, aData.length == aData.length
	 * @param bData != null
	 * @return the Hamming Distance between the two arrays of ints.
	 */

	public static int hammingDistance(int[] aData, int[] bData) {
		// check preconditions
		if (aData == null || bData == null || aData.length != bData.length) {
			throw new IllegalArgumentException("Violation of precondition: "
					+ "hammingDistance. neither parameter may equal null, arrays"
					+ " must be equal length.");
		}
		int errorCounter = 0;
		for (int i = 0; i < aData.length; i++) {
			// if the same index at each array has different values, add to
			// error counter
			if (aData[i] != bData[i])
				errorCounter++;
		}

		return errorCounter;
	}

	/**
	 * Determine if one array of ints is a permutation of another. Neither the
	 * parameter <tt>aData</tt> or the parameter <tt>bData</tt> are altered as a
	 * result of this method.<br>
	 * 
	 * @param aData != null
	 * @param bData != null
	 * @return <tt>true</tt> if aData is a permutation of bData, <tt>false</tt>
	 *         otherwise
	 * 
	 */
	public static boolean isPermutation(int[] aData, int[] bData) {
		// check preconditions
		if (aData == null || bData == null) {
			throw new IllegalArgumentException("Violation of precondition: "
					+ "isPermutation. neither parameter may equal null.");
		}
		// create copy of second array
		int[] bCopy = new int[bData.length];
		for (int i = 0; i < bData.length; i++)
			bCopy[i] = bData[i];

		for (int i = 0; i < aData.length; i++) {
			// find index j of same value at aData[i] in bCopy, and swap it to
			// bCopy[i]
			for (int j = i; j < bCopy.length; j++) {
				if (aData[i] == bCopy[j])
					swap(bCopy, i, j);
			}
			// if same value was not found or the arrays are not same length
			// cannot be permutations
			if (aData[i] != bCopy[i] || aData.length != bCopy.length)
				return false;
		}
		return true;
	}

	/**
	 * This method swaps the values located at startIndex and endIndex in an
	 * array
	 * 
	 * @param intArray:   the array that needs values to be swapped
	 * @param startIndex: the index of one of the values that needs to be
	 *                    swapped
	 * @param endIndex:   the index of the other value that needs to be swapped
	 * @return nothing (array is modified without needing to return it)
	 */
	private static void swap(int[] intArray, int startIndex, int endIndex) {
		int temp = intArray[startIndex];
		intArray[startIndex] = intArray[endIndex];
		intArray[endIndex] = temp;
	}

	/**
	 * Determine the index of the String that has the largest number of vowels.
	 * Vowels are defined as <tt>'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 
	 * 'U', and 'u'</tt>. The parameter <tt>arrayOfStrings</tt> is not altered
	 * as a result of this method.
	 * <p>
	 * pre: <tt>arrayOfStrings != null</tt>, <tt>arrayOfStrings.length > 0</tt>,
	 * there is an least 1 non null element in arrayOfStrings.
	 * <p>
	 * post: return the index of the non-null element in arrayOfStrings that has
	 * the largest number of characters that are vowels. If there is a tie
	 * return the index closest to zero. The empty String, "", has zero vowels.
	 * It is possible for the maximum number of vowels to be 0.<br>
	 * 
	 * @param arrayOfStrings the array to check
	 * @return the index of the non-null element in arrayOfStrings that has the
	 *         largest number of vowels.
	 */
	public static int mostVowels(String[] arrayOfStrings) {
		// check preconditions
		if (arrayOfStrings == null || arrayOfStrings.length == 0
				|| !atLeastOneNonNull(arrayOfStrings)) {
			throw new IllegalArgumentException("Violation of precondition: "
					+ "mostVowels. parameter may not equal null and must contain "
					+ "at least one none null value.");
		}
		String uppercaseVowels = "AEIOU";
		int maxVowelCount = 0;
		int currentVowelCount = 0;
		int maxVowelIndex = -1;
		// traverse arrayOfStrings
		for (int i = 0; i < arrayOfStrings.length; i++) {
			currentVowelCount = 0;
			if (arrayOfStrings[i] != null) {
				String countItsVowels = arrayOfStrings[i];
				// traverse string by letter, and if letter as an uppercase is
				// an uppercase vowel, add it to currentVowelCount
				for (int j = 0; j < countItsVowels.length(); j++) {
					if (uppercaseVowels.contains(
							countItsVowels.substring(j, j + 1).toUpperCase())) {
						currentVowelCount++;
					}
				}
				// if the current string has more vowels than previous highest
				// vowel string, or if its the first string, store that index
				// and its vowel count
				if (currentVowelCount > maxVowelCount || maxVowelIndex == -1) {
					maxVowelCount = currentVowelCount;
					maxVowelIndex = i;
				}
			}

		}

		return maxVowelIndex;
	}

	/**
	 * Perform an experiment simulating the birthday problem. Pick random
	 * birthdays for the given number of people. Return the number of pairs of
	 * people that share the same birthday.<br>
	 * 
	 * @param numPeople     The number of people in the experiment. This value
	 *                      must be > 0
	 * @param numDaysInYear The number of days in the year for this experiment.
	 *                      This value must be > 0
	 * @return The number of pairs of people that share a birthday after running
	 *         the simulation.
	 */
	public static int sharedBirthdays(int numPeople, int numDaysInYear) {
		// check preconditions
		if (numPeople <= 0 || numDaysInYear <= 0) {
			throw new IllegalArgumentException("Violation of precondition: "
					+ "sharedBirthdays. both parameters must be greater than 0. "
					+ "numPeople: " + numPeople + ", numDaysInYear: "
					+ numDaysInYear);

		}
		// index is birthday. value is frequency that birthday occured
		int[] quantityOfSameBirthdays = new int[numDaysInYear];
		// generate a birthday, and add 1 to the value (frequency) at that index
		// (the birthday)
		int totalShareBday = 0;
		for (int i = 0; i < numPeople; i++) {
			int genBirthday = (int) (Math.random() * numDaysInYear);
			quantityOfSameBirthdays[genBirthday]++;
			// subtracting 1 to add amount of new pairs to totalShareBday
			totalShareBday += quantityOfSameBirthdays[genBirthday] - 1;
		}
		return totalShareBday;

	}

	/**
	 * Determine if the chess board represented by board is a safe set up.
	 * <p>
	 * pre: board != null, board.length > 0, board is a square matrix. (In other
	 * words all rows in board have board.length columns.), all elements of
	 * board == 'q' or '.'. 'q's represent queens, '.'s represent open
	 * spaces.<br>
	 * <p>
	 * post: return true if the configuration of board is safe, that is no queen
	 * can attack any other queen on the board. false otherwise. the parameter
	 * <tt>board</tt> is not altered as a result of this method.<br>
	 * 
	 * @param board the chessboard
	 * @return true if the configuration of board is safe, that is no queen can
	 *         attack any other queen on the board. false otherwise.
	 */
	public static boolean queensAreSafe(char[][] board) {
		char[] validChars = { 'q', '.' };
		// check preconditions
		if (board == null || board.length == 0 || !isSquare(board)
				|| !onlyContains(board, validChars)) {
			throw new IllegalArgumentException("Violation of precondition: "
					+ "queensAreSafe. The board may not be null, must be square, "
					+ "and may only contain 'q's and '.'s");
		}

		final char QUEEN = 'q';
		int extraQueenCount = 0;
		// traverse board
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				extraQueenCount = 0;
				// once find a queen...
				if (board[row][col] == QUEEN) {

					// count extra queens on same row
					extraQueenCount += countQueens(board, QUEEN, row, 0, col,
							1);
					// count extra queens on same column
					extraQueenCount += countQueens(board, QUEEN, row, 1, col,
							0);
					// count extra queens on diagonal going to the bottom left
					extraQueenCount += countQueens(board, QUEEN, row, 1, col,
							-1);
					// count extra queens on diagonal going to the bottom right
					extraQueenCount += countQueens(board, QUEEN, row, 1, col,
							1);
				}

				if (extraQueenCount > 0)
					return false;
			}
		}
		return true;

	}

	/**
	 * This method counts extra queens based on row/col indexes passed in
	 * 
	 * @param board         the chessboard
	 * @param QUEEN:        queen character on board
	 * @param rowStart:     start/current row index
	 * @param rowChange:    change to rowStart index (increment/decrement)
	 * @param columnStart:  start/current col index
	 * @param columnChange: change to columnStart index (increment/decrement)
	 * @return extraQueenCount: number of extra queens
	 */

	private static int countQueens(char[][] board, char QUEEN, int rowStart,
			int rowChange, int columnStart, int columnChange) {
		int extraQueenCount = 0;
		// runs until rowStart or columnStart is out of bounds and counts queens
		while ((rowStart < board.length && rowStart >= 0)
				&& (columnStart >= 0 && columnStart < board[0].length)) {
			if (board[rowStart][columnStart] == QUEEN)
				extraQueenCount++;
			rowStart += rowChange;
			columnStart += columnChange;
		}
		// -1 to not count queen on initial rowStart columnStart as an extra
		// queen
		return extraQueenCount - 1;
	}

	/**
	 * Given a 2D array of ints return the value of the most valuable contiguous
	 * sub rectangle in the 2D array. The sub rectangle must be at least 1 by 1.
	 * <p>
	 * pre: <tt>mat != null, mat.length > 0, mat[0].length > 0,
	 * mat</tt> is a rectangular matrix.
	 * <p>
	 * post: return the value of the most valuable contiguous sub rectangle in
	 * <tt>city</tt>.<br>
	 * 
	 * @param city The 2D array of ints representing the value of each block in
	 *             a portion of a city.
	 * @return return the value of the most valuable contiguous sub rectangle in
	 *         <tt>city</tt>.
	 */
	public static int getValueOfMostValuablePlot(int[][] city) {
		// check preconditions
		if (city == null || city.length == 0 || city[0].length == 0
				|| !isRectangular(city)) {
			throw new IllegalArgumentException("Violation of precondition: "
					+ "getValueOfMostValuablePlot. The parameter may not be null,"
					+ " must value at least one row and at least"
					+ " one column, and must be rectangular.");
		}
		int largestValue = Integer.MIN_VALUE;
		// traverse city
		for (int row = 0; row < city.length; row++)
			for (int col = 0; col < city[row].length; col++) {
				// buildMatrix used here to generate all the possible horizontal
				// (same row) sub plots to the right of col
				// store sum of generated matrix only if its greater than
				// current largestValue
				largestValue = Math.max(buildMatrix(city, row, row, 0, col),
						largestValue);
				// generates all the possible below and to the right sub plots
				// (not including directly horizontal, which is done above)
				// of row and col (inclusive) and stores sum of matrix if its
				// greater than largestValue
				for (int bottomRowIndex = row; bottomRowIndex < city.length; bottomRowIndex++)
					for (int rightColIndex = col; rightColIndex < city[0].length; rightColIndex++)
						largestValue = Math.max(buildMatrix(city, row,
								bottomRowIndex, col, rightColIndex),
								largestValue);
			}
		return largestValue;
	}

	/**
	 * Builds sub matrix from city
	 * 
	 * @param rowStart:    start row index of matrix
	 * @param rowEnd:      end row index of matrix
	 * @param columnStart: start column index of matrix
	 * @param columnEnd    end column index of matrix
	 * @return sum: sum of matrix
	 */

	private static int buildMatrix(int[][] city, int rowStart, int rowEnd,
			int columnStart, int columnEnd) {
		int sum = 0;
		for (int row = rowStart; row <= rowEnd; row++)
			for (int col = columnStart; col <= columnEnd; col++)
				sum += city[row][col];
		return sum;
	}

	/*
	 * Birthday Experiment 1 Calculates and prints average number of people with
	 * shared birthdays over numTimes simulations
	 */

	public static void birthdayExperimentOne(int numTimes, int numPeople,
			int numDaysInYears) {
		int count = 0;
		for (int i = 0; i < numTimes; i++)
			count += sharedBirthdays(numPeople, numDaysInYears);
		System.out.println("Num people: " + numPeople + ", numDaysInYears: "
				+ numDaysInYears + ", numTimesExperimentRun: " + numTimes
				+ ", average number of people that shared birthdays: "
				+ count / numTimes);

	}

	/*
	 * Birthday Experiment 2 Calculates and prints the percentage of experiments
	 * where at least one pair of people shared birthday
	 */
	public static void birthdayExperimentTwo(int numTimes, int numPeople,
			int numDaysInYears) {
		int onePair = 0;
		for (int i = 0; i < numTimes; i++) {
			if (sharedBirthdays(numPeople, numDaysInYears) >= 1)
				onePair++;
		}
		double percentage = (double) onePair * 100 / numTimes;
		System.out.print(" Num people: " + numPeople
				+ ", number of experiments with one or more shared birthday: "
				+ onePair + ", percentage: ");
		System.out.printf("%.2f\n", percentage);

	}

	/*
	 * pre: arrayOfStrings != null post: return true if at least one element in
	 * arrayOfStrings is not null, otherwise return false.
	 */
	private static boolean atLeastOneNonNull(String[] arrayOfStrings) {
		// check precondition
		if (arrayOfStrings == null) {
			throw new IllegalArgumentException("Violation of precondition: "
					+ "atLeastOneNonNull. parameter may not equal null.");
		}
		boolean foundNonNull = false;
		int i = 0;
		while (!foundNonNull && i < arrayOfStrings.length) {
			foundNonNull = arrayOfStrings[i] != null;
			i++;
		}
		return foundNonNull;
	}

	/*
	 * pre: mat != null post: return true if mat is a square matrix, false
	 * otherwise
	 */
	private static boolean isSquare(char[][] mat) {
		if (mat == null) {
			throw new IllegalArgumentException("Violation of precondition: "
					+ "isSquare. Parameter may not be null.");
		}
		final int numRows = mat.length;
		int row = 0;
		boolean isSquare = true;
		while (isSquare && row < numRows) {
			isSquare = (mat[row] != null) && (mat[row].length == numRows);
			row++;
		}
		return isSquare;
	}

	/*
	 * pre: mat != null, valid != null post: return true if all elements in mat
	 * are one of the characters in valid
	 */
	private static boolean onlyContains(char[][] mat, char[] valid) {
		// check preconditions
		if (mat == null || valid == null) {
			throw new IllegalArgumentException("Violation of precondition: "
					+ "onlyContains. Parameters may not be null.");
		}
		String validChars = new String(valid);
		int row = 0;
		boolean onlyContainsValidChars = true;
		while (onlyContainsValidChars && row < mat.length) {
			int col = 0;
			while (onlyContainsValidChars && col < mat[row].length) {
				int indexOfChar = validChars.indexOf(mat[row][col]);
				onlyContainsValidChars = indexOfChar != -1;
				col++;
			}
			row++;
		}
		return onlyContainsValidChars;
	}

	/*
	 * pre: mat != null, mat.length > 0 post: return true if mat is rectangular
	 */
	private static boolean isRectangular(int[][] mat) {
		// check preconditions
		if (mat == null || mat.length == 0) {
			throw new IllegalArgumentException("Violation of precondition: "
					+ "isRectangular. Parameter may not be null and must contain"
					+ " at least one row.");
		}
		boolean correct = mat[0] != null;
		int row = 0;
		while (correct && row < mat.length) {
			correct = (mat[row] != null) && (mat[row].length == mat[0].length);
			row++;
		}
		return correct;
	}

	// make constructor private so no instances of CodeCamp can not be created
	private CodeCamp() {

	}
}