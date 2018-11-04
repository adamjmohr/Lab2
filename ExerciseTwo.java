/*
 * Name: Adam Mohr
 * Student ID: 040669681
 * Course & Section: CST8132 301
 * Assignment: Lab 2
 * Date: Sept 28, 2018
 */

public class ExerciseTwo {

	private int[][] myArray;

	public ExerciseTwo() {
		// Two-dimensional array of integers.
		this.myArray = new int[6][10];
		
		// Initializes the elements of this array of arrays with values from 1 to 60 or 6 x 10.
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				myArray[i][j] = j + 1;
				
				// Calculates subsequent rows with correct increment.
				if (i > 0) {
					myArray[i][j] = j + 1 + i * myArray[i].length;
				}
			}
		}
	}

	public void printArrayValues() {
		System.out.println("myArray = {");
		
		// Prints out values of myArray.
		for (int i = 0; i < myArray.length; i++) {
			System.out.print("{");
			for (int j = 0; j < myArray[i].length; j++) {
				System.out.print(myArray[i][j]);
				if (j < myArray[i].length - 1) {
					// Omits comma on last number to format correctly.
					System.out.print(",");
				}
			}
			// Omits comma on last number to format correctly.
			if (i == myArray.length - 1) {
				System.out.print("}");
			} else {
				System.out.print("},");
			}
			System.out.println();
		}
		System.out.println("};");
	}

	public void displayArrayTotal() {
		
		// Calculates the total sum of all elements of the 2-dimensional array.
		int sum = 0;
		for (int[] i : myArray) {
			for (int j : i) {
				sum += j;
			}
		}

		System.out.print("The sum of all elements of myArray is " + sum + ".");
	}

	public static void main(String[] args) {
		// Creates ExerciseTwo object and calls methods on it.
		ExerciseTwo exerciseTwo = new ExerciseTwo();
		exerciseTwo.printArrayValues();
		exerciseTwo.displayArrayTotal();
		
	}
}