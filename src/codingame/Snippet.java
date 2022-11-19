package codingame;
import codingame.DynamicArray;

public class Snippet {
		public static void main(String[] args) {
	
			DynamicArray test = new DynamicArray();
			
	        Integer[] denominations ={3,2,1}; 
			Integer amount = 7;
	        System.out.println("Ways: " + test.ways(denominations,amount));
	        //1111111
	        //111112
	        //2221
	        //31111
	        //3211
	        //322
	        //331
		}
	
}