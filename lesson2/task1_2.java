package lesson2;

public class task1_2 {

	public static void main(String[] args) {
		// 1. ��������� ������ � ������ ������� � �������
		// ���������� ������� �� �����

		int x[] = new int[10];

		for (int i = 0; i < x.length; i++) {
			x[i] = i + 1;
		}

		for (int i = 0; i < x.length; i++) {
			// System.out.println(x[i]);
		}

		// 1.1 ������� ���������� ������� � � ������� �������
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.println(x[i]);
		}

	}

}
