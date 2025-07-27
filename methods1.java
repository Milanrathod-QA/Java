import java.util.Scanner;

public class methods1 {
	
	// Method to print a message when the first value is not greater
	public static void firstMethodMessage() {
        System.out.println("The first value is not greater than the second value.");
    }

    // Method to print a message when the first value is greater
    public static void secondMethodMessage() {
        System.out.println("The first value is greater than the second value.");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two values
        System.out.print("Enter the first value: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int secondValue = scanner.nextInt();

        // Compare the values and call the appropriate method
        if (firstValue > secondValue) {
            secondMethodMessage(); // Call the second method if firstValue is greater
        } else {
            firstMethodMessage(); // Call the first method otherwise
        }

        // Close the scanner
        scanner.close();
    }
	}
