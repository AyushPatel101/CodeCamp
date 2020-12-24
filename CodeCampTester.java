import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// CodeCamp.java - CS314 Assignment 1 - Tester class

/*
 * Student information for assignment: 

 * Name: Ayush Patel
 * email address: patayush01@utexas.edu
 * UTEID: ap55837
 * Section 5 digit ID: 50865
 * Grader name: Tony
 * Number of slip days used on this assignment: 0
 */

/*
 Birthday experiment 1:
 Num people: 182, numDaysInYears: 365, numTimesExperimentRun: 1000000, average number of people that shared birthdays: 45
 
 Birthday experiment 2:
 Given a 365 day year, it requires 23 people to have a 50% chance of having at least 1 shared birthday
 Num people: 2, number of experiments with one or more shared birthday: 141, percentage: 0.28
 Num people: 3, number of experiments with one or more shared birthday: 398, percentage: 0.80
 Num people: 4, number of experiments with one or more shared birthday: 809, percentage: 1.62
 Num people: 5, number of experiments with one or more shared birthday: 1417, percentage: 2.83
 Num people: 6, number of experiments with one or more shared birthday: 2013, percentage: 4.03
 Num people: 7, number of experiments with one or more shared birthday: 2748, percentage: 5.50
 Num people: 8, number of experiments with one or more shared birthday: 3844, percentage: 7.69
 Num people: 9, number of experiments with one or more shared birthday: 4751, percentage: 9.50
 Num people: 10, number of experiments with one or more shared birthday: 5932, percentage: 11.86
 Num people: 11, number of experiments with one or more shared birthday: 7016, percentage: 14.03
 Num people: 12, number of experiments with one or more shared birthday: 8529, percentage: 17.06
 Num people: 13, number of experiments with one or more shared birthday: 9863, percentage: 19.73
 Num people: 14, number of experiments with one or more shared birthday: 11327, percentage: 22.65
 Num people: 15, number of experiments with one or more shared birthday: 12517, percentage: 25.03
 Num people: 16, number of experiments with one or more shared birthday: 14312, percentage: 28.62
 Num people: 17, number of experiments with one or more shared birthday: 15651, percentage: 31.30
 Num people: 18, number of experiments with one or more shared birthday: 17312, percentage: 34.62
 Num people: 19, number of experiments with one or more shared birthday: 19070, percentage: 38.14
 Num people: 20, number of experiments with one or more shared birthday: 20440, percentage: 40.88
 Num people: 21, number of experiments with one or more shared birthday: 22315, percentage: 44.63
 Num people: 22, number of experiments with one or more shared birthday: 23819, percentage: 47.64
 Num people: 23, number of experiments with one or more shared birthday: 25519, percentage: 51.04
 Num people: 24, number of experiments with one or more shared birthday: 26954, percentage: 53.91
 Num people: 25, number of experiments with one or more shared birthday: 28554, percentage: 57.11
 Num people: 26, number of experiments with one or more shared birthday: 30066, percentage: 60.13
 Num people: 27, number of experiments with one or more shared birthday: 31105, percentage: 62.21
 Num people: 28, number of experiments with one or more shared birthday: 32637, percentage: 65.27
 Num people: 29, number of experiments with one or more shared birthday: 33961, percentage: 67.92
 Num people: 30, number of experiments with one or more shared birthday: 35397, percentage: 70.79
 Num people: 31, number of experiments with one or more shared birthday: 36520, percentage: 73.04
 Num people: 32, number of experiments with one or more shared birthday: 37613, percentage: 75.23
 Num people: 33, number of experiments with one or more shared birthday: 38655, percentage: 77.31
 Num people: 34, number of experiments with one or more shared birthday: 39801, percentage: 79.60
 Num people: 35, number of experiments with one or more shared birthday: 40732, percentage: 81.46
 Num people: 36, number of experiments with one or more shared birthday: 41771, percentage: 83.54
 Num people: 37, number of experiments with one or more shared birthday: 42439, percentage: 84.88
 Num people: 38, number of experiments with one or more shared birthday: 43129, percentage: 86.26
 Num people: 39, number of experiments with one or more shared birthday: 43871, percentage: 87.74
 Num people: 40, number of experiments with one or more shared birthday: 44594, percentage: 89.19
 Num people: 41, number of experiments with one or more shared birthday: 45211, percentage: 90.42
 Num people: 42, number of experiments with one or more shared birthday: 45726, percentage: 91.45
 Num people: 43, number of experiments with one or more shared birthday: 46144, percentage: 92.29
 Num people: 44, number of experiments with one or more shared birthday: 46507, percentage: 93.01
 Num people: 45, number of experiments with one or more shared birthday: 47022, percentage: 94.04
 Num people: 46, number of experiments with one or more shared birthday: 47386, percentage: 94.77
 Num people: 47, number of experiments with one or more shared birthday: 47744, percentage: 95.49
 Num people: 48, number of experiments with one or more shared birthday: 47982, percentage: 95.96
 Num people: 49, number of experiments with one or more shared birthday: 48273, percentage: 96.55
 Num people: 50, number of experiments with one or more shared birthday: 48551, percentage: 97.10
 Num people: 51, number of experiments with one or more shared birthday: 48748, percentage: 97.50
 Num people: 52, number of experiments with one or more shared birthday: 48965, percentage: 97.93
 Num people: 53, number of experiments with one or more shared birthday: 49026, percentage: 98.05
 Num people: 54, number of experiments with one or more shared birthday: 49188, percentage: 98.38
 Num people: 55, number of experiments with one or more shared birthday: 49323, percentage: 98.65
 Num people: 56, number of experiments with one or more shared birthday: 49400, percentage: 98.80
 Num people: 57, number of experiments with one or more shared birthday: 49483, percentage: 98.97
 Num people: 58, number of experiments with one or more shared birthday: 49580, percentage: 99.16
 Num people: 59, number of experiments with one or more shared birthday: 49641, percentage: 99.28
 Num people: 60, number of experiments with one or more shared birthday: 49719, percentage: 99.44
 Num people: 61, number of experiments with one or more shared birthday: 49756, percentage: 99.51
 Num people: 62, number of experiments with one or more shared birthday: 49799, percentage: 99.60
 Num people: 63, number of experiments with one or more shared birthday: 49839, percentage: 99.68
 Num people: 64, number of experiments with one or more shared birthday: 49863, percentage: 99.73
 Num people: 65, number of experiments with one or more shared birthday: 49879, percentage: 99.76
 Num people: 66, number of experiments with one or more shared birthday: 49906, percentage: 99.81
 Num people: 67, number of experiments with one or more shared birthday: 49923, percentage: 99.85
 Num people: 68, number of experiments with one or more shared birthday: 49950, percentage: 99.90
 Num people: 69, number of experiments with one or more shared birthday: 49940, percentage: 99.88
 Num people: 70, number of experiments with one or more shared birthday: 49967, percentage: 99.93
 Num people: 71, number of experiments with one or more shared birthday: 49970, percentage: 99.94
 Num people: 72, number of experiments with one or more shared birthday: 49968, percentage: 99.94
 Num people: 73, number of experiments with one or more shared birthday: 49980, percentage: 99.96
 Num people: 74, number of experiments with one or more shared birthday: 49985, percentage: 99.97
 Num people: 75, number of experiments with one or more shared birthday: 49986, percentage: 99.97
 Num people: 76, number of experiments with one or more shared birthday: 49984, percentage: 99.97
 Num people: 77, number of experiments with one or more shared birthday: 49994, percentage: 99.99
 Num people: 78, number of experiments with one or more shared birthday: 49995, percentage: 99.99
 Num people: 79, number of experiments with one or more shared birthday: 49995, percentage: 99.99
 Num people: 80, number of experiments with one or more shared birthday: 49998, percentage: 100.00
 Num people: 81, number of experiments with one or more shared birthday: 49995, percentage: 99.99
 Num people: 82, number of experiments with one or more shared birthday: 49996, percentage: 99.99
 Num people: 83, number of experiments with one or more shared birthday: 49997, percentage: 99.99
 Num people: 84, number of experiments with one or more shared birthday: 49999, percentage: 100.00
 Num people: 85, number of experiments with one or more shared birthday: 49999, percentage: 100.00
 Num people: 86, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 87, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 88, number of experiments with one or more shared birthday: 49999, percentage: 100.00
 Num people: 89, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 90, number of experiments with one or more shared birthday: 49999, percentage: 100.00
 Num people: 91, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 92, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 93, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 94, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 95, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 96, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 97, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 98, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 99, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 Num people: 100, number of experiments with one or more shared birthday: 50000, percentage: 100.00
*/

public class CodeCampTester {

	public static void main(String[] args) {
		final String newline = System.getProperty("line.separator");

		// test 1, hamming distance
		int[] h1 = new int[] { 20, -20, 40, -40, 60, -60, 80, -80 };
		int[] h2 = new int[] { 20, 40, 60, 80, -80, -60, -40, -20 };
		int expected = 6;
		int actual = CodeCamp.hammingDistance(h1, h2);
		System.out.println(newline + "Test 1 hamming distance: expected value: "
				+ expected + ", actual value: " + actual);
		if (expected == actual) {
			System.out.println(" passed test 1, hamming distance");
		} else {
			System.out.println(" ***** FAILED ***** test 1, hamming distance");
		}

		// test 2, hamming distance
		h1 = new int[] { 0, 8, 7, 4, -6, 20, -7, -40, -26 };
		h2 = h1.clone();
		expected = 0;
		actual = CodeCamp.hammingDistance(h1, h2);
		System.out.println(newline + "Test 2 hamming distance: expected value: "
				+ expected + ", actual value: " + actual);
		if (expected == actual) {
			System.out.println(" passed test 2, hamming distance");
		} else {
			System.out.println(" ***** FAILED ***** test 2, hamming distance");
		}

		// test 3, isPermutation
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 2, 1, 3, 5, 4, -6 };
		boolean expectedBool = false;
		boolean actualBool = CodeCamp.isPermutation(a, b);
		System.out.println(newline + "Test 3 isPermutation: expected value: "
				+ expectedBool + ", actual value: " + actualBool);
		if (expectedBool == actualBool) {
			System.out.println(" passed test 3, isPermutation");
		} else {
			System.out.println(" ***** FAILED ***** test 3, isPermutation");
		}

		// test 4, is Permutation
		a = new int[] { 0 };
		b = new int[] { Integer.MAX_VALUE - Integer.MAX_VALUE };
		expectedBool = true;
		actualBool = CodeCamp.isPermutation(a, b);
		System.out.println(newline + "Test 4 isPermutation: expected value: "
				+ expectedBool + ", actual value: " + actualBool);
		if (expectedBool == actualBool) {
			System.out.println(" passed test 4, isPermutation");
		} else {
			System.out.println(" ***** FAILED ***** test 4, isPermutation");
		}

		// test 5, mostVowels
		String[] arrayOfStrings = { "HelloOoO", "I", "AAAaAM", "mAkIng",
				"random", "test", "CASES", null };
		int expectedResult = 0;
		int actualResult = CodeCamp.mostVowels(arrayOfStrings);
		System.out.println(newline + "Test 5 mostVowels: expected result: "
				+ expectedResult + ", actual result: " + actualResult);
		if (actualResult == expectedResult) {
			System.out.println("passed test 5, mostVowels");
		} else {
			System.out.println("***** FAILED ***** test 5, mostVowels");
		}

		// test 6, mostVowels
		arrayOfStrings = new String[500000];
		arrayOfStrings[500000 - 1] = "U";
		expectedResult = 500000 - 1;
		actualResult = CodeCamp.mostVowels(arrayOfStrings);
		System.out.println(newline + "Test 6 mostVowels: expected result: "
				+ expectedResult + ", actual result: " + actualResult);
		if (actualResult == expectedResult) {
			System.out.println("passed test 6, mostVowels");
		} else {
			System.out.println("***** FAILED ***** test 6, mostVowels");
		}

		// test 7, sharedBirthdays
		int pairs = CodeCamp.sharedBirthdays(36, 1);
		System.out.println(newline
				+ "Test 7 shared birthdays: expected: 630, actual: " + pairs);
		int expectedShared = 630;
		if (pairs == expectedShared) {
			System.out.println("passed test 7, shared birthdays");
		} else {
			System.out.println("***** FAILED ***** test 7, shared birthdays");
		}

		// test 8, sharedBirthdays
		pairs = CodeCamp.sharedBirthdays(1, 1);
		System.out.println(newline + "Test 8 shared birthdays: expected: 0"
				+ ", actual: " + pairs);
		if (pairs == 0) {
			System.out.println("passed test 8, shared birthdays");
		} else {
			System.out.println("***** FAILED ***** test 8, shared birthdays.");
		}

		// test 9, queensAreASafe
		char[][] board = { { '.', '.', 'q' }, { 'q', '.', '.' },
				{ '.', '.', '.' } };

		expectedBool = true;
		actualBool = CodeCamp.queensAreSafe(board);
		System.out.println(newline + "Test 9 queensAreSafe: expected value: "
				+ expectedBool + ", actual value: " + actualBool);
		if (expectedBool == actualBool) {
			System.out.println(" passed test 9, queensAreSafe");
		} else {
			System.out.println(" ***** FAILED ***** test 9, queensAreSafe");
		}

		// test 10, queensAreASafe
		board = new char[][] { { 'q', '.', '.', '.', '.', '.', '.' },
				{ '.', '.', '.', '.', 'q', '.', '.' },
				{ '.', '.', '.', '.', '.', '.', '.' },
				{ '.', '.', '.', '.', '.', 'q', '.' },
				{ '.', '.', 'q', '.', '.', '.', '.' },
				{ '.', 'q', '.', '.', '.', '.', '.' },
				{ '.', '.', '.', 'q', '.', '.', '.' } };
		expectedBool = false;
		actualBool = CodeCamp.queensAreSafe(board);
		System.out.println(newline + "Test 10 queensAreSafe: expected value: "
				+ expectedBool + ", actual value: " + actualBool);
		if (expectedBool == actualBool) {
			System.out.println(" passed test 10, queensAreSafe");
		} else {
			System.out.println(" ***** FAILED ***** test 10, queensAreSafe");
		}

		// test 11, getValueOfMostValuablePlot
		int[][] city = { { 0, -5, 0, 0, -7 }, { 0, 0, -10, 2, 0 },
				{ -4, -5, -1, -2, 0 }, { -1, 1, -1, -2, -3 },
				{ -10, 1, 1, -3, 1 }, { -4, -8, 1, -5, -1 } };

		expected = 2;
		actual = CodeCamp.getValueOfMostValuablePlot(city);
		System.out.println(
				newline + "Test 11 getValueOfMostValuablePlot: expected value: "
						+ expected + ", actual value: " + actual);
		if (expected == actual) {
			System.out.println(" passed test 11, getValueOfMostValuablePlot");
		} else {
			System.out.println(
					" ***** FAILED ***** test 11, getValueOfMostValuablePlot");
		}

		// test 12, getValueOfMostValuablePlot
		int[][] cityR = { { -9, 0, 0, 0, -1 }, { 0, 0, -10, -5, 0 },
				{ 0, -7, 0, -2, 0 } };

		expected = 0;
		actual = CodeCamp.getValueOfMostValuablePlot(cityR);
		System.out.println(
				newline + "Test 12 getValueOfMostValuablePlot: expected value: "
						+ expected + ", actual value: " + actual);
		if (expected == actual) {
			System.out.println(" passed test 12, getValueOfMostValuablePlot");
		} else {
			System.out.println(
					" ***** FAILED ***** test 12, getValueOfMostValuablePlot");
		}

	} // end of main method

	// pre: list != null
	private static int[] intListToArray(List<Integer> list) {
		if (list == null) {
			throw new IllegalArgumentException(
					"list parameter may not be null.");
		}
		int[] result = new int[list.size()];
		int arrayIndex = 0;
		for (int x : list) {
			result[arrayIndex++] = x;
		}
		return result;
	}
}
