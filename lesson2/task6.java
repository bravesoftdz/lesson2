package lesson2;

import java.util.Random;

public class task6 {

	public static void main(String[] args) {
		// Подсчитать количество чётных и нечётных элементов в массиве
		int x[] = new int[100];

		for (int i = 0; i < x.length; i++) {
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;

		}

		int valueOddElements = 0;
		int valueEvenElements = 0;

		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				valueEvenElements = valueEvenElements + 1;
			} else if (x[i] % 2 != 0) {
				valueOddElements = valueOddElements + 1;
			}
		}

		System.out.println("Even element: " + valueEvenElements);
		System.out.println("Odd element: " + valueOddElements);

	}

}
