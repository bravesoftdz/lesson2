package lesson2;

import java.util.Random;

public class task3 {

	public static void main(String[] args) {

		// 2 ��������� ������ �������� �� 100 ��������� ��������� ������ �������

		int x[] = new int[100];

		for (int i = 0; i < x.length; i++) {

			Random r = new Random();
			int s = r.nextInt(1000);

			x[i] = s;

		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
