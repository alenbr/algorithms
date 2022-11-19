package codility;
import java.util.HashMap;
import java.util.Map;

public class OddOccurencesInArray {

	public static void main(String[] args) {
		
		int[] nums = {9, 3, 9, 3, 9, 7, 9};
		System.out.println("Result: " + oddOccurrences(nums));
	}

	public static int oddOccurrences(int[] A) {
		Map<Integer,Integer> values = new HashMap<>();
		for (int x = 0; x < A.length; x++) {
			if (values.containsKey(A[x])) {
				int qt = values.get(A[x]) + 1;
				values.replace(A[x], qt);
			} else {
				 values.put(A[x], 1);
			}
		}
		
	return	values.entrySet().stream().filter(v -> v.getValue() % 2 > 0).mapToInt(v -> v.getKey()).findAny().orElse(0);
	}
}
