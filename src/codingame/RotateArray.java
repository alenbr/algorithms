package codingame;
import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3};
		System.out.println("Result: " + Arrays.toString(rotateArray(nums,4)));
	}

	public static int [] rotateArray(int[] A, int K) {
		if (A.length == 0)
			return A;
		if (K == 0)
			return A;
		
		int [] result = new int[A.length];
		for (int x = 0; x < K; x++) {
			result[0] = A[A.length-1];
			System.arraycopy(A, 0, result, 1,A.length-1);
			System.out.println("result: " + result.toString());
			System.arraycopy(result, 0, A, 0, result.length);;
		
		}
		return result;
	}
}
