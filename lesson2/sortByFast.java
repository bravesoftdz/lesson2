package task13;

import java.util.Random;

public class sortByFast {

	public static void main(String[] args) {

		System.out.println("\nSort by fast method\n");

		int N = 10;
		int[] A;
		A = new int[N + 1];
		// Array filling
		for (int i = 0; i <= N; i = i + 1) {
			A[i] = N - i;
			System.out.print(A[i] + " ");
		}
		System.out.println("\nBefore qSort\n");
		// Agitating the array
		Random r = new Random(); // Initialization from the timer
		int yd, xs;
		for (int i = 0; i <= N; i = i + 1) {
			yd = A[i];
			xs = r.nextInt(N + 1);
			A[i] = A[xs];
			A[xs] = yd;
		}
		for (int i = 0; i <= N; i = i + 1)
			System.out.print(A[i] + " ");
		System.out.println("\nAfter randomization\n");
		long start, end;
		int low = 0;
		int high = N;

		start = System.nanoTime(); // Get the initial time
		qSort(A, low, high);
		end = System.nanoTime(); // Get the end time

		for (int i = 0; i <= N; i++)
			System.out.print(A[i] + " ");
		System.out.println("\nAfter qSort");
		System.out.println("\nTime of running: " + (end - start) + " nanosec");
	}

	// описание функции qSort
	public static void qSort(int[] A, int low, int high) {
		int i = low;
		int j = high;
		int x = A[low + (high - low) / 2];
		do {
			while (A[i] < x)
				++i;
			while (A[j] > x)
				--j;
			if (i <= j) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
				j--;
			}
		} while (i <= j);
		// Recursive calls to the qSort function
		if (low < j)
			qSort(A, low, j);
		if (i < high)
			qSort(A, i, high);
	}

}
