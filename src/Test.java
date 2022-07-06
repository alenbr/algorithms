import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		
		//		
//		Test test = new Test();
		LinkedList<String> testList = new LinkedList<>();
		testList.add("Msg 1");
		testList.add("Msg 2");
		testList.add("Msg 3");
		testList.add("Msg 4");
		testList.add("Msg 5");
		testList.add("Msg 6");
		
		String ts = testList.stream().map(w -> w.toString()).collect(Collectors.joining(","));
		System.out.println(ts);
			

//		
//		printLog("Testando mensagem","abcd1234",new RuntimeException("TesteException"));
//
//		List<Object[]> resultNotaDebito = new ArrayList<>();
//		resultNotaDebito.add(new Object[]{3});
//		Long qtdeNotaPending = Long.valueOf((Integer)(resultNotaDebito.get(0)[0]));
//		if (qtdeNotaPending == 0l)
//			return;

		//		testCast();

//		Test.printMap();
//		List<Integer> songs = new ArrayList<>();
//		for (int x=0; x < 100000;x++)
//				songs.add(x);
//		System.out.println(Calendar.getInstance().getTime());
//		System.out.println(test.getSongPairCount(songs));
//		System.out.println(Calendar.getInstance().getTime());
//		test.fizzBuzz(15);
//        System.out.println(10 * 20 + "Javatpoint"); 
//        System.out.println("Javatpoint" + 10 * 20);
//        System.out.println(20 << 20);
//        Integer[][] intervals ={{1,3},{5,8},{4,10},{20,25}};
//        test.overlap(intervals);
//        System.out.println("Rooms: " + test.rooms(lectures));
//        Integer[][] lectures ={{30,75},{0,50},{60,150},{65,180},{0,50}}; 
//        System.out.println("Rooms: " + test.rooms(lectures));
//        int [] fromIds  ={4,6,9,1};
//        int [] toIds  ={9,1,5,4};
//        System.out.println("Last id: " + test.findNetworkNode(5,fromIds, toIds));
	}
	private static void printLog(String msg, String protocolo, Exception ex) {
		System.out.println(MessageFormat.format("{0} - {1} - {2}",protocolo, msg, ex));
	}

	public static void testCast() {
		Object[] rec = new Object[] {null,null};
		String tst = (String) rec[0];
		Date dt = (Date)rec[1];
		System.out.println(tst);
		System.out.println(dt);
	}
    public static long getSongPairCount(List<Integer> songs) {
        int qty = 0;
        Integer[] arraySong = songs.stream()
                             .toArray(Integer[]::new);
        for (int x=0; x < arraySong.length-1; x++) {
            for (int y=x+1; y < arraySong.length; y++ ) {
                qty += ((arraySong[x] + arraySong[y]) % 60) == 0 ? 1 : 0;
            }
        }
    return qty;
    }
    public static void printMap() {
        Map<String,String> list = new HashMap<>();
        list.put("v1", "One");
        list.put("v2", "Two");
        list.put("v3", "Tree");
        
        list.values().forEach(v -> System.out.print(v));
        
    }

	 public static void fizzBuzz(int n) {
		    
		    int i = 0;
		    while (i < n) {
		        i+=1;
		        int rem3 = i % 3;
		        int rem5 = i % 5;
		        
		        if (rem3 == 0 && rem5 == 0) 
		            System.out.println("FizzBuzz");
		        else if (rem3 == 0) 
		            System.out.println("Fizz");
		        else if (rem5 == 0)
		            System.out.println("Buzz");
		        else 
		            System.out.println(i);  
		        }
    }	
	public Integer overlap(Integer [][] intervals) {
		int rooms = 0;
		Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
//	 	IntStream.range(0, intervals.length).forEach(x -> System.out.println(intervals[x][0] + " " + intervals[x][1]));
//		System.out.println("intervals: " + intervals.toString());
//		for (int cur = 0; cur < lectures.length-1);cur++) {
//			if (lectures[cur][1] > lectures[cur+1][0])
//				rooms++;
//			System.out.println("Start: " + lectures[cur][0] + " End: " + lectures[cur][1]);
//		}
		
		return rooms;
}

	public Integer rooms(Integer [][] lectures) {
			int rooms = 0;
			Arrays.sort(lectures,(a,b) -> Integer.compare(a[0],b[0]));
			for (int cur = 0; cur < lectures.length-1;cur++) {
				if (lectures[cur][1] > lectures[cur+1][0])
					rooms++;
				System.out.println("Start: " + lectures[cur][0] + " End: " + lectures[cur][1]);
			}
			
			return rooms;
	}

	public Integer findNetworkNode(int startNodeId, int fromIds[], int toIds[]) {
			
		 	Map<Integer,Integer> nodes = new HashMap<Integer,Integer>(fromIds.length);
		 	IntStream.range(0, fromIds.length).forEach(x -> nodes.put(fromIds[x], toIds[x])); 
			int last = startNodeId;
			Integer next = 0;
			boolean found = true;
			while (found) {
				next = nodes.get(last);
				if (next == null)
					found = false;
				else 
					last = next;
			}
			return last;
	}
	
//	public List<String> flightRoute(List<String[]> routes, String origin) {
//		Map<String,String> flights = new HashMap<String,String>();
//		
//		routes.stream().forEach((R) -> System.out.println("K:" + R[0] + " V:" + R[1]));
//		routes.stream().forEach(flt -> flights.put(flt[0], flt[1]));
//		
//		flights.entrySet().stream().forEach((E) -> System.out.printf("K:%s V:%s",E.getKey(),E.getValue()));
//		
//		return new ArrayList<>();
//		
//	}
		
		
		
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
	public static int loopSum(int [] lista, int start, int value) {
		return (start >= lista.length ? value : (loopSum(lista, start + 1,value + lista[start])));
	}
	public static void mapList() {
		final Map<String,String> lst = new HashMap<>();
		lst.put("v1","one");
		lst.put("v2","two");
		lst.put("v3","tree");
		System.out.println(lst);

		final Set<String> set = new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("tree");
		System.out.println(set);
		

		Consumer<String> print =  System.out::print;

		lst.values().forEach(print);
		System.out.println("");

		lst.values().stream().map(v -> v + " ").forEach(System.out::print);
		System.out.print(lst.values());

        Function<Double,String> doubleSquare = (V) -> {
						        	Double teste = V * V;
						        	return teste.toString();
        };

        System.out.println("Double: " + doubleSquare.apply(10.0));

        Supplier<Double> doubleSupplier1 = () -> {
        						return Math.random();
        };
        
        Supplier<String> stringSupplier = () -> "sadasfsadfsdafsdfsdaf";
		DoubleSupplier doubleSupplier2 = Math::random;
		System.out.println(stringSupplier.get());

		System.out.println(doubleSupplier1.get());
		System.out.println(doubleSupplier2.getAsDouble());
		    
		System.out.print(lst.values().stream().collect(Collectors.joining(" ")));
	}
}


