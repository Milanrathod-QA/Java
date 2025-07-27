import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
	    //String[] stringArray = {"Volvo", "BMW", "Ford", "Mazda"};
		//System.out.println(Arrays.deepToString(stringArray));
	    //System.out.println(Arrays.toString(stringArray));
	    
	    /*System.out.println(Arrays.asList(stringArray));
	    System.out.print(stringArray.length);*/
	
	    int n;
	    Scanner sc  = new Scanner (System.in);
	    System.out.print("Enter number");
	    
	    n = sc.nextInt();
	    int[] array = new int[10];
	    System.out.println("enter element of array");
	    
	    for(int i=0; i<n; i++) {
	    	array[i] = sc.nextInt();
	    }
	    Arrays.sort(array);  
	    System.out.println("Array elements are");
	    
	    for(int i=0; i<n; i++) {
	
			Arrays.sort(array);	
	    	
	    	System.out.println("array is " + Arrays.toString(array));
	    	
	    	
	    	
	    		
	    }
	   
	    
		
		
	
	
	}
}
