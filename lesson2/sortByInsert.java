package task13;

public class sortByInsert {

	public static void main(String[] args) {

		System.out.println("\nSort by insert method\n");

		// Find the time of sorting
		// Get the time to start sorting
		long start, end;
		start = System.nanoTime();

		// Create array
		int[] arr = { 2, 5, 7, 8, 3, 0, 20, 55, 152, 65, 24, 86 };

		// Sort array on method "insert"
		int temp, j;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i + 1];
				arr[i + 1] = arr[i];
				j = i;
				while (j > 0 && temp < arr[j - 1]) {
					arr[j] = arr[j - 1];
					j--;
				}
				arr[j] = temp;
			}
		}

		// We get the end time of sorting
		end = System.nanoTime();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\nTime of running: " + (end - start) + " nanosec");

	}

}