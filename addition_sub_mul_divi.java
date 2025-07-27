
import java.util.Scanner;
public class addition_sub_mul_divi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, second, add, sub, multiply;
		float devide;
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter Two number");
		
		first = input.nextInt();
		second = input.nextInt();
		
		add = first + second;
		multiply = first * second;
		sub = first - second;
		devide = (float) first / second;
		
		System.out.println("Sun = "+ add);
		System.out.println("Multiplication = "+ multiply);
		System.out.println("Substraction = "+ sub);
		System.out.println("Devide = "+devide);
		
		
		//Just print user name given by user
		/*Scanner input = new Scanner(System.in);
		System.out.println("enter name");
		String fname = input.next();
		System.out.println("your name is: -->"+ fname );
		System.out.println( fname +" " + "Welcomr to the team");*/
		
		
		
	}

}
