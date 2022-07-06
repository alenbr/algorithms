import java.util.Stack;

public class EncodedString {

	public static void main(String[] args) {

		
/*		Input: 1[ac2[de]] Output: acdede
		Input: 2[a4[b]c13d2[e]] Output: abbbbc13deeabbbbc13dee
		Input: 1[a2[b1[c11[d]]]] Output: abcdddddddddddbcddddddddddd */

		System.out.println(decode ("2[a4[b]c13d2[e]]"));
		System.out.println(decode ("1[a2[b1[c11[d]]]]"));
		System.out.println(decode ("1[ac2[de]]"));
		System.out.println(decode ("1[a2[b1[c12[d]]]]"));
		
	}

	public static String decode(String encoded) {
		Stack<Integer> points = new Stack<>();
		for (int x =0; x < encoded.length();x++ ) {
			if (encoded.charAt(x) == '[')
				points.push(x);
			else if (encoded.charAt(x) == ']') {
				int pos = points.pop();
				int p = qtPosition(encoded,pos);
				int qt = Integer.valueOf(encoded.substring(p+1,pos));
				String part = encoded.substring(pos+1,x);
				encoded = encoded.substring(0, p+1) + replicate(part, qt) + encoded.substring(x+1);
				if (p >=0)
					x = p + qt-1;
			}
		}
		
		return encoded;
	}

	public static int qtPosition(String encoded, int pos) {
		String qt = ""; 
		int cur = pos;
		while (cur >=0) {
			if (encoded.charAt(cur) >= 0x30 && encoded.charAt(cur) <= 0x39) {
				qt = encoded.charAt(cur) + qt;
			} else if (encoded.charAt(cur) != '[')
				break;
			cur--;
		}
		return cur;
	}
	public static String replicate(String part, int qty) {
		String replicated = ""; 
		for (int x = 0; x < qty; x++) {
			replicated += part;
		}
		return replicated;
	}
}
