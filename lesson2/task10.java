package lesson2;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {

		String fullName;

		// Create Scanner
		@SuppressWarnings("resource")
		Scanner enteredWord = new Scanner(System.in);

		// Insert first name
		System.out.println("Please insert your first name: ");
		String fName = enteredWord.nextLine();

		// Insert last name
		System.out.println("Please insert your last name: ");
		String lName = enteredWord.nextLine();

		// Insert middle name
		System.out.println("Please insert your middle name: ");
		String mName = enteredWord.nextLine();

		// Get full name
		fullName = fName + " " + lName + " " + mName;

		// Get length sentence "fName"
		int lengthFName = fullName.length();

		// Create array type "char"
		char fNameChar[] = new char[lengthFName];

		// Filling array by character
		for (int i = 0; i < lengthFName; ++i) {
			fNameChar[i] = fullName.charAt(i);
		}

		// Create string from array
		String myFullName = new String(fNameChar);

		System.out.printf("You entered: " + myFullName);

	}

}
