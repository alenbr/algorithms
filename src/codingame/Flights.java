package codingame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flights {

	public static void main(String[] args) {

		Flights test = new Flights();
		List<String[]> routes = new ArrayList<>();
//		routes.add((String[])Arrays.asList("123","ABC").toArray());
//		routes.add((String[])Arrays.asList("123","ABC").toArray());
		
		test.flightRoute(routes, "123");
		
		
		
	}
	public List<String> flightRoute(List<String[]> routes, String origin) {
		Map<String,String> flights = new HashMap<String,String>();
		
		routes.stream().forEach((R) -> System.out.println("K:" + R[0] + " V:" + R[1]));
		routes.stream().forEach(flt -> flights.put(flt[0], flt[1]));
		
		flights.entrySet().stream().forEach((E) -> System.out.printf("K:%s V:%s",E.getKey(),E.getValue()));
		
		return new ArrayList<>();
		
	}
		
}
