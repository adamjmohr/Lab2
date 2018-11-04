import java.text.DecimalFormat;

/*
 * Name: Adam Mohr
 * Student ID: 040669681
 * Course & Section: CST8132 301
 * Assignment: Lab 2
 * Date: Sept 28, 2018
 */

public class ExerciseOne {

	private int[] myArray;

	public ExerciseOne() {
		this.myArray = new int[10];

		// Initialize and instantiate myArray of ten integers with values 1 through 10.
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i + 1;
		}
	}

	public void printArrayValues() {
		System.out.print("myArray = {");

		// Prints out values of myArray.
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i]);
			if (i < myArray.length - 1) {
				// Omits comma on last number to format correctly.
				System.out.print(",");
			}
		}
		System.out.println("};");
	}

	public void displayArrayProduct() {
		System.out.print("The product of all elements of myArray is ");

		// Calculates the product of the values of elements in myArray.
		int product = 1;
		for (int i : myArray) {
			product *= i;
		}

		// Formats the output with thousands separators.
		DecimalFormat df = new DecimalFormat("#,###,###");

		System.out.print(df.format(product) + ".");
	}

	public static void main(String[] args) {
		// Creates ExerciseOne object and calls methods on it.
		ExerciseOne exerciseOne = new ExerciseOne();
		exerciseOne.printArrayValues();
		exerciseOne.displayArrayProduct();
		
	}
}