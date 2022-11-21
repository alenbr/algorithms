package codility;

import java.util.Stack;

public class WordMachine {

	public static void main(String[] args) {
		System.out.println(wordMachine("4 5 6 - 7 +"));
		System.out.println(wordMachine("13 DUP 4 POP 5 DUP + DUP + -"));
		System.out.println(wordMachine("5 6 + -"));
		System.out.println(wordMachine("3 DUP 5 - -"));
		System.out.println(wordMachine("1048575 DUP +"));
		
		
	}

	public static int wordMachine(String S) {
		Stack<Integer> values = new Stack<Integer>();
		
		String[] words = S.split(" ");
				
		for (String value : words) {
			if ("+,-".contains(value) && values.size() < 2)
				return -1;
			switch (value) {
				case "DUP": values.push(values.peek());
							break;
				case "POP": values.pop();
							break;
				case "+":   values.push(values.pop() + values.pop());
							break;
				case "-":   int second = values.pop();
							int top = values.pop();
							values.push(second - top);
							break;
				default: values.push(Integer.valueOf(value));
			}
		}
		if (values.empty())
			return -1;
		int result = values.pop();
		return (result > 1048575 || result < -1048575) ? -1 : result;
	}
}