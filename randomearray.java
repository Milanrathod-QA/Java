
import java.util.Random;

public class randomearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
			//Pick any random element n array 
			int[] myArray = {11, 25, 83, 43, 75, 96}; 
		    Random rand = new Random();
		    int randomElement = myArray[rand.nextInt(myArray.length)];  
		    System.out.println(randomElement);
		
	}

}