import java.util.*;

public class java_conditions {

	//private static final String Scanner = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java if, else if, switch condition
		
		//Java program to check entered user age
		/*System.out.print("Java program for check user age is under 18 or not");
		Scanner reader = new Scanner (System.in);
		int age = reader.nextInt(); 
		
		if(age > 18) {
			System.out.print("You are adult");
		}else {
			System.out.print("You are not adult");
		}*/
		
		//Java program for odd and even 
		/*System.out.print("Java program for check entered number is odd or even");
		Scanner reader = new Scanner (System.in);
		int num = reader.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "is even number");
		}else {
			System.out.println(num  + "is odd number");
		}*/
		
		//Java else if condition
		//Java program for check entered digit is equal, greater or less 
				/*System.out.println("Java program for check entered digit is equal, greater or less");
				Scanner reader = new Scanner (System.in);
				int num1 = reader.nextInt();
				int num2 = reader.nextInt();
				
				if (num1 == num2) {
					System.out.println(num1 + " number is equal");
				}else if (num1 > num2) {
					System.out.println(num1 + " is greater");
				}else {
					System.out.println(num1 + "is less number");
				}*/
		
		
		/*System.out.println("Press 1 , 2, or 3");
		Scanner reader = new Scanner (System.in);
		int button = reader.nextInt();
		
		
		if (button ==1 ) {
			System.out.println("Hello");
		}else if (button == 2) {
			System.out.println("Namaste");
		}else if (button == 3) {
			System.out.println("Ola");
		}else {
			System.out.println("This is invalid input");
		}*/
		
		//switch conditions
		
		
		
		
		/*System.out.println( "please enter digit only ");
        Scanner reader = new Scanner(System.in);
		System.out.println("Please enter any input below 1 to 7");

		int button =  reader.nextInt();
		switch(button) {
		 case 1: 
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thu");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
		default : System.out.println("Invalid input");
		}*/
		
		
		//Check input validations 
	/*int n = 0;
	boolean flag;
	
	do {
		try {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter digit ony");
			n = sc.nextInt();
			flag = false;
		}catch(Exception e) {
			//accept int only 
			System.out.println("Enter only integer value.."+e);
	        flag=true;
		}
		}while(flag);
		System.out.println("entered value is "+ n);*/
	
		
	 //if user is adult then give choise for entering digit
		
		/*System.out.println("please enter any digit");
		Scanner reader = new Scanner (System.in);
		int num = reader.nextInt();
		if (num > 18) {
			System.out.println("You are adult ");
			System.out.println("Congratulations, PLease enter number between 1 to 7");
			int button =  reader.nextInt();
			switch(button) {
			 case 1: 
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wed");
				break;
			case 4:
				System.out.println("Thu");
				break;
			case 5:
				System.out.println("Fri");
				break;
			case 6:
				System.out.println("Sat");
				break;
			case 7:
				System.out.println("Sun");
				break;
			default : System.out.println("Invalid input");
			}
		}else {
			System.out.println("This is not adult "+num);
		}*/
		
	//Simple for loop 	
	/*int i;
	for (i=1; i<10; i++) {
		System.out.println("hello");
		System.out.println(i);
		}*/
		
	}
}