import java.util.Scanner;
import java.util.Random;

/*public class RandomNumberGuess {
///The progra is like capcha code
	public static void main(String[] args) {
		//create random number generator	
		Random rand = new Random();
		//Generate random number between 1 to 1000
		int randomNumber = rand.nextInt(100) + 1;
		
		//scanner object to read input from console and print 
		Scanner scn  = new Scanner(System.in);
		System.out.println("Guess the random number between 1 and 1000:" + randomNumber);
		
		//validate user input
		int user = scn.nextInt();
		
		// to check input is correct or not 
		if(user == randomNumber) {
			System.out.println("valid input");
		}else {
			System.out.println("Invalid! The correct number is: " + randomNumber);
		}
		scn.close();
	}
	
}*/

public class RandomNumberGuess {
    public static void main(String[] args) {
        // Characters allowed in the random string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        // StringBuilder to build random string
        StringBuilder randomString = new StringBuilder();

        // Random number generator
        Random random = new Random();

        // Generate 5-character random string
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }

        // Store the generated string
        String generated = randomString.toString();

        // Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the 5-character string:" + randomString);

        // Read user input
        String userInput = scanner.nextLine();

        // Validate the user input against the generated string
        if (userInput.equals(generated)) {
            System.out.println("Valid! You guessed the correct string.");
        } else {
            System.out.println("Invalid! The correct string was: " + generated);
        }

        // Close the scanner
        scanner.close();
    }
}
