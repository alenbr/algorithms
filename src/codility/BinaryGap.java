package codility;
import java.util.stream.IntStream;

public class BinaryGap {

	public static void main(String[] args) {

		binaryGap(2147483647);
	}

	public static void binaryGap(int N) {
		
		String binaryString = Integer.toBinaryString(N);
		int maxGap = 0, currentGap = 0;
		boolean startGap = false, endGap = false;
		
		for (int p=0; p < binaryString.length();p++ ) {
			if (binaryString.charAt(p) == '1') {
				if (!startGap)
					startGap = true;
				else {
					endGap = true;
					if (currentGap > maxGap) {
				    	maxGap = currentGap;
						currentGap = 0;
						}
					else 
						currentGap = 0;
				}
			} else if (startGap)
					currentGap++;
		}
		if (!startGap || !endGap)
			maxGap = 0;
		
		System.out.println ("N: " + N + " binary: " + binaryString + " Gap: " + maxGap);
	}
}