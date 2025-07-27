import java.util.Scanner;
public class sum_for_endnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create a Scanner object to read input from the console
		   /*     Scanner scanner = new Scanner(System.in);
		        double sum = 0.0;

		        System.out.println("Enter numbers to sum them up. Type 'exit' to finish:");

		        // Loop until there are no more tokens
		        while (scanner.hasNext()) {
		            if (scanner.hasNextDouble()) {
		                // Read the next double value
		                double number = scanner.nextDouble();
		                sum += number; // Add the number to the sum
		            } else {
		                // If the input is not a double, check if it's "exit"
		                String input = scanner.next();
		                if (input.equalsIgnoreCase("exit")) {
		                    break; // Exit the loop if the user types "exit"
		                } else {
		                    System.out.println("Invalid input. Please enter a number or type 'exit' to finish.");
		                }
		            }
		        }

		        // Display the total sum
		        System.out.println("Total sum: " + sum);

		        // Close the scanner
		        scanner.close();*/
		
		        
		        // Program to validate user input is integer or not 
		        //To validate with the user input is correct or not
		        Scanner scanner = new Scanner(System.in);
		        int sum = 0;

		        System.out.println("Enter integers to sum them up. Type 'exit' to finish:");

		        // Loop until the user decides to exit
		        while (true) {
		            System.out.print("Enter an integer: ");
		            if (scanner.hasNextInt()) {
		                // Read the next integer value
		                int number = scanner.nextInt();
		                sum += number; // Add the number to the sum
		            } else {
		                // Check if the input is "exit"
		                String input = scanner.next();
		                if (input.equalsIgnoreCase("exit")) {
		                    break; // Exit the loop if the user types "exit"
		                } else {
		                    System.out.println("Invalid input. Please enter a valid integer or type 'exit' to finish.");
		                }
		            }
		        }

		        // Display the total sum
		        System.out.println("Total sum: " + sum);

		        // Close the scanner
		        scanner.close();
		        
		    }
		}
