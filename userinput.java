import java.util.Scanner;


public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Java program to taking input from user");
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter nu,ber 1");
		int a = sc.nextInt();
		System.out.println("Eneter nu,ber 2");
		int b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("total is" + sum);
		// Close the scanner
		sc.close();*/
        
		
		 // Create a Scanner object to read input from the console
       /* Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display the input back to the user
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner
        scanner.close();*/
		//--------------------to print name in next line---------------------- 
		System.out.println("Java program to taking input from user");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter Age");
		int b = sc.nextInt();
		sc.nextLine(); // Consume the newline character left by nextInt()
		 
		System.out.println("Eneter name");
		String name = sc.nextLine();
		
		System.out.println("hi"+ " " + name + " " + "Your age is" + b);
		
		sc.close();
		
		
		
		
	}

}
