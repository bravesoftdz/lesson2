package task13;

public class sortByChoice {

	public static void main(String[] args) {

		System.out.println("\nSort by choise method\n");

		// Find the time of sorting
		// Get the time to start sorting
		long start, end;
		start = System.nanoTime();

		// Create array
		int[] arr = { 2, 5, 7, 8, 3, 0, 20, 55, 152, 65, 24, 86 };

		// Sort array on method "choice"
		int min, temp;

		for (int index = 0; index < arr.length - 1; index++) {
			min = index;
			for (int scan = index + 1; scan < arr.length; scan++) {
				if (arr[scan] < arr[min])
					min = scan;
			}

			// Swap the values
			temp = arr[min];
			arr[min] = arr[index];
			arr[index] = temp;
		}

		// We get the end time of sorting
		end = System.nanoTime();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\nTime of running: " + (end - start) + " nanosec");

	}

}
