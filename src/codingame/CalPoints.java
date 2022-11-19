package codingame;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;



public class CalPoints {

	public static void main(String[] args) {
		String[] values = {"5","-2","4","C","D", "9","+","+"};
		System.out.println("Value: " + calPoints(values));
	}

	public static int calPoints(String[] ops) {
		List<Integer> op = new ArrayList<>();

		Map<String,Consumer<List<Integer>>> oper =Map.of(
													"C", (L) -> L.remove(L.size()-1),
													"D",(L) -> L.add(L.get(L.size()-1) * 2),
													"+", (L) -> L.add(L.get(L.size()-1)+L.get(L.size()-2)));
		for (String value : ops) 
			if (oper.containsKey(value))
			  oper.get(value).accept(op);
 		   else
			  op.add(Integer.parseInt(value));
		
		return op.stream().mapToInt(Integer::intValue).sum();

		}

}
