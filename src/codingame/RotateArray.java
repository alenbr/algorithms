package codingame;
import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7};
		System.out.println("Result: " + Arrays.toString(rotateArray(nums,3)));
	}

	public static int [] rotateArray(int[] nums, int k) {
		int [] result = new int[nums.length];

		int point = nums.length - k;
		System.arraycopy(nums, point, result, 0, k);
		System.arraycopy(nums, 0, result, k, point);
		return result;
	}

}
