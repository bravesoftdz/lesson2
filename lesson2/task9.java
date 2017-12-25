package lesson2;

public class task9 {

	public static void main(String[] args) {
		
		// Create String with fName
		String fName = "Gvozdev Aleksander";
		
		// Get length sentence "fName"
		int lengthFName = fName.length();

		// Create array type "char"
		char fNameChar[] = new char[lengthFName];

		// Filling array by character
		for (int i = 0; i < lengthFName; ++i) {
			fNameChar[i] = fName.charAt(i);
		}

		System.out.println(fNameChar);
	}

}
