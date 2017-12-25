package lesson2;

public class task1_2 {

	public static void main(String[] args) {
		// 1. Заполнить массив х целыми чисалми и вывести
		// содержимое массива на экран

		int x[] = new int[10];

		for (int i = 0; i < x.length; i++) {
			x[i] = i + 1;
		}

		for (int i = 0; i < x.length; i++) {
			// System.out.println(x[i]);
		}

		// 1.1 Вывести содержимое массива х в обртном порядке
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.println(x[i]);
		}

	}

}
