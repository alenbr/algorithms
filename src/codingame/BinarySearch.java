package codingame;

public class BinarySearch {

	public static void main(String[] args) {

		
		char [] values ="abcdefghlmnopqrstuvxwyz".toCharArray();
		char value = values[bynarySearch(values, 'z')];
		System.out.println(value);
	}

	public static int bynarySearch(int[] array, int key) {
		
		int low = 0;
		int high = array.length -1;
		int middle = 0;
		int element = 0;
		int intNumber = 0;
		while (low <= high) {
			intNumber++;
			middle = (low + high) / 2;
			System.out.println("Inter: " + intNumber);
			element = array[middle];
			if (element < key) {
				low = middle + 1;
			} else if (element > key) {
				high = middle -1;
			} else {
				return middle;
			}
		}
		return -1;
	}
	public static int bynarySearch(char[] array, char key) {
		
		int low = 0;
		int high = array.length -1;
		int middle = 0;
		char element = 0;
		int intNumber = 0;
		while (low <= high) {
			intNumber++;
			middle = (low + high) / 2;
			System.out.println("Inter: " + intNumber);
			element = array[middle];
			if (element < key) {
				low = middle + 1;
			} else if (element > key) {
				high = middle -1;
			} else {
				return middle;
			}
		}

		return -1;
		
	}
}
