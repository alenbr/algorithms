import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralTest {

	public static void main(String[] args) {

		GeneralTest test = new GeneralTest();
		List<String[]> routes = new ArrayList<>();
		routes.add((String[])Arrays.asList("123","ABC").toArray());
		routes.add((String[])Arrays.asList("123","ABC").toArray());
		
		test.flightRoute(routes, "123");
		
		
		
	}
	public List<String> flightRoute(List<String[]> routes, String origin) {
		Map<String,String> flights = new HashMap<String,String>();
		
		routes.stream().forEach((R) -> System.out.println("K:" + R[0] + " V:" + R[1]));
		
		try {
				routes.stream().forEach(flt -> flights.put(flt[0], flt[1]));
		} catch(Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		
		flights.entrySet().stream().forEach((E) -> System.out.printf("K:%s V:%s",E.getKey(),E.getValue()));
		return new ArrayList<>();
		
	}
		
		
		
		//			GeneralTest test = new GeneralTest();
			
//			List<Integer> largeList = new ArrayList<>();
//			IntStream.rangeClosed(1, 100000).forEach(v -> largeList.add(v));
			
//			System.out.println(test.checkValue(Arrays.asList(10,15,3,7,20),21));
//			System.out.println("Start: " + LocalTime.now());
//			System.out.println(test.checkValue(largeList,200000));
//			System.out.println("End: " + LocalTime.now());

//	}
	
//	public boolean  checkValue(List<Integer> values, Integer k) {
//		  Boolean result = false;
//		  Set<Integer> list = new HashSet<Integer>();
//		  AtomicInteger iteractions = new AtomicInteger(0);
//		  values.stream().forEach(v -> list.add(v)); 
//  		 System.out.println("Start Approach 1: " + LocalTime.now());
//		  result = values.stream().anyMatch(val -> {
//			  iteractions.incrementAndGet();
//			  return list.contains(k - val);
//			  });
//		  System.out.println("Interactions: " + iteractions.get());
//  		 System.out.println("Start Approach 2: " + LocalTime.now());
//  		iteractions.set(0);
//	  		 for (Integer val : values) {
//			  iteractions.incrementAndGet();
//			  if (list.contains(k - val)) {
//			      result = true;
//			  	  break;
//			  	}
//		  }
//		  System.out.println("Interactions: " + iteractions.get());
//   		 System.out.println("End checkValue: " + LocalTime.now());
//		  return result;
//	  }
}
