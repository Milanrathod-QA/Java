import java.util.Scanner;

public class invalidinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String line = sc.nextLine();

        try {
            int enteredNumber = Integer.parseInt(line);
            System.out.println("You have entered valid int input: " + enteredNumber);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
        
        
		
	}



}
