package lesson2;

public class task11 {

	public static void main(String[] args) {

		//Create array with elements
		int array[] = new int[10];
		//Create index zero
		int index = 0;
		//Create new array with elements without numeral multiple 3
		int newArray[] = new int[10];
		for (int i = 0; i < newArray.length; i++) {
			//Create random and adding elements in newArray
			newArray[i] = (int) (Math.random() * newArray.length + 1);
			//Find elements multiple 3
			if (newArray[i] % 3 != 0) {
				//Insert other elements in array
				array[index] = newArray[i];
				index++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}