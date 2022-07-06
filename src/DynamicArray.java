import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

	public static void main(String[] args) {

		
      Integer[] denominations ={3,2,1};
      Integer amount = 7;
      System.out.println("Ways: " + ways(denominations,amount));
	}
	
	public static String reverse(char[] inputString, int beg, int end) {
		if (beg < end) {
			char ch = inputString[beg];
		    inputString[beg] = inputString[end];
		    inputString[end] = ch;
		    reverse(inputString,beg + 1, end - 1);
		}
	    return String.copyValueOf(inputString);
	}

	
	public static boolean palindrome(String inputString) {
		char[] reverse = new char[inputString.length()];
		int position = inputString.length()-1;
	    for (int c = 0; c <  inputString.length(); c++) {
			reverse[position] = inputString.charAt(c);
			position = position - 1;
	    }
		return String.valueOf(reverse).equals(inputString);
	}
	public static Integer ways(Integer [] denominations,Integer amount) {
			int resto = 0;
			int way = 0;
			List<Integer> list = new ArrayList<>();
			List<Integer> comb = new ArrayList<>();
			int x = 0;
			while (x < denominations.length) {
				list.clear();
				resto = amount - comb.stream().mapToInt(Integer::valueOf).sum();
				int y = comb.size();
				while (y < denominations.length && resto > 0) {
						while (denominations[y] <= resto) {
								resto -= denominations[y];
							 	list.add(denominations[y]);
						}
						y++;
				}
				if (resto == 0) {
					way++;
					System.out.println(way + " - " + list.toString());
					comb.add(denominations[y-1]);
				} else {
					x++;
					comb.clear();
				}
			}
			return way;
	}
}
