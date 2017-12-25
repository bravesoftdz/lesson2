package lesson2;
import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {

		// Create scanner
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// Insert number start
		System.out.println("Ånter the length of the array:");
		int c = sc.nextInt();

		// Create array
		int newArray[] = new int[c];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (int) (Math.random() * newArray.length + 1);
			// System.out.println(newArray[i]);
		}
		// Insert number start
		System.out.println("Enter a number from:");
		int a = sc.nextInt();

		// Insert number stop
		System.out.println("Enter a number to::");
		int b = sc.nextInt();

		// Out results

		System.out.print("Result ");
		for (int i = a; i < b + 1; i++) {
			System.out.print(newArray[i] + " ");
		}

	}

}
