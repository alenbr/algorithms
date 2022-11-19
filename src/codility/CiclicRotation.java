package codility;
import java.util.Arrays;

public class CiclicRotation {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4};
		System.out.println("Result: " + Arrays.toString(rotateArray(nums,4)));
	}

	public static int [] rotateArray(int[] A, int K) {
		if (A.length == 0)
			return A;
		if (K == 0)
			return A;
		
		for (int x = 0; x < K; x++) {
			int last = A[A.length-1];
			System.arraycopy(A, 0, A, 1,A.length-1);
			A[0] = last;
		}
		return A;
	}
}
