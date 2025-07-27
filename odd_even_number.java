import java.util.Scanner;

public class odd_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int num = reader.nextInt();
		
		
		if(num % 2 == 0)
			System.out.println(num + "Ths is Even Number");
		else 
			System.out.println(num + "This is Odd Number");
	}

}
