package codility;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {

		int[] A = {3,4,4,6,1,4,4};
		
		System.out.println("result: " + Arrays.toString(maxCounters(5, A)));
	}

	public static int [] maxCounters(int N, int[] A) {

		int[] result = new int[N];
		Arrays.fill(result, 0);
		
		if (A.length == 0)
			return result;
		
		int maxCounter = 0;
		
		for (int K=0; K < A.length; K++ ) {
			
			if (A[K] > N)
				Arrays.fill(result, maxCounter);
			else {
				result[A[K]-1]++;
				if (result[A[K]-1] > maxCounter)
					maxCounter = result[A[K]-1]; 
			}
		}
		return result;
	}
}