package lesson2;

import java.util.Random;

public class task7 {

	public static void main(String[] args) {
		// Найти и вывести на экран максимальный / минимальный элемент из задания 3
		int x[] = new int[100];

		for (int i = 0; i < x.length; i++) {
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;

		}

		int max = x[0];
		int min = x[0];
		for (int i = 0; i != x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
			if (x[i] < min) {
				min = x[i];
			}
		}
		System.out.println("Even element: " + max);
		System.out.println("Odd element: " + min);

	}

}
