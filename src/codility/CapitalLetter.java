package codility;

public class CapitalLetter {

	public static void main(String[] args) {

		capitalLetter(10);
	}

	public static void capitalLetter(int N) {
		
		for (int x =0; x < N-1; x++) {
			System.out.println("L");
		}
		for (int x =0; x < N; x++) {
			System.out.print("L");
		}
		return;
	}
}