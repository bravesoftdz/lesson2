package lesson2;

public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x1 = 1;
		int x2 = 2;

		int[] x = new int[5];
		char y[] = new char[10];

		// 1. Заполнить массив х целыми чисалми и вывести
		// содержимое массива на экран

		int cell[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < cell.length; i++) {
			System.out.println(cell[i]);
		}
	}

}
