package lesson2;

import java.util.Random;

public class task5 {

	public static void main(String[] args) {
		// Посчитать разность всех не четных эелемнтов массива
		int x[] = new int[100];
		for (int i = 0; i < x.length; i++) {
			Random ran = new Random();
			int s = ran.nextInt(1000);
			x[i] = s;
		}
		int c = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				c = c - x[i];
			}
		}
		System.out.println(c);
	}

}
