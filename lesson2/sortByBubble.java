package task13;

public class sortByBubble {

	public static void main(String[] args) {

		System.out.println("\nSort by bubble method\n");

		// Find the time of sorting
		// Get the time to start sorting
		long start, end;
		start = System.nanoTime();

		// Create array
		int[] arr = { 2, 5, 7, 8, 3, 0, 20, 55, 152, 65, 24, 86 };

		// Sort array on method "bubble"
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
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
