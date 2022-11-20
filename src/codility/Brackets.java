package codility;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {

		
		System.out.println("result: " + brackets("{[()()]}"));
		System.out.println("result: " + brackets("([)()]"));
		
	}

	public static int brackets(String  S) {
		int result = 1;
		if (S.isEmpty())
			return result;
		
		Stack<Character> brackets = new Stack<>();
		for (int p=0; p < S.length();p++ ) {
			Character c = S.charAt(p);
			if (c == '{' || c == '(' || c == '[')
				brackets.push(c);
			else if (c == ')' || c == ']' || c == '}') {
				if (brackets.isEmpty())
					return 0;
				Character r = brackets.pop();
				if ((c == ')' && r == '(') || 
						(c == ']' && r == '[') || (c == '}' && r == '{'))
					result  = 1;
				else
					return 0;
			}
		}
		if (!brackets.isEmpty())
			return 0;
		
		return 1;
	}
}