package lesson2;

import java.util.Random;

public class task8 {

	public static void main(String[] args) {

		int x[] = new int[100];

		for (int i = 0; i < x.length; i++) {
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;

		}

		// even elements
		int maxEven = x[0];
		int minEven = x[0];
		int valueEvenElements = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				valueEvenElements = valueEvenElements + 1;

				if (x[i] > maxEven) {
					maxEven = x[i];
				}
				if (x[i] < minEven) {
					minEven = x[i];
				}
			}

		}

		// odd elements
		int maxOdd = x[0];
		int minOdd = x[0];
		int valueOddElements = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				valueOddElements = valueOddElements + 1;

				if (x[i] > maxOdd) {
					maxOdd = x[i];
				}
				if (x[i] < minOdd) {
					minOdd = x[i];
				}
			}
		}

		System.out.println("Even element: " + valueEvenElements + " MAX=" + maxEven + " MIN=" + minEven);
		System.out.println("Odd element: " + valueOddElements + " MAX=" + maxOdd + " MIN=" + minOdd);
	}

}
