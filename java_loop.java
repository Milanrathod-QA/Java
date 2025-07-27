import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class java_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For loop
		/*for(int i=1; i<=10; i++)
			
			System.out.print(i);*/
		 ArrayList<Integer> arrlist = new ArrayList<Integer>();
	      arrlist.add(144);
	      arrlist.add(7);
	      arrlist.add(39);
	      arrlist.add(40);
	      

	      /* For Loop for iterating ArrayList */
	      System.out.println("For Loop");
	      for (int counter = 0; counter < arrlist.size(); counter++) { 		      
	          System.out.println(arrlist.get(counter)); 		
	      }   		
	      
	   // Sort the ArrayList in descending order
	      Collections.sort(arrlist, Collections.reverseOrder());
	      System.out.println("Sorted ArrayList (Descending): " + arrlist);

	}
}


