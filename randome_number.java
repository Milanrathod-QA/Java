import java.util.Random;

public class randome_number {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		//generate random number in 0-100
		int a = rand.nextInt(100);
		System.out.println("randome number is:" +a);
		
		}

}
