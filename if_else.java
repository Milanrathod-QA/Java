import java.util.*;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int age = 20;
		if(age > 22) {
			System.out.print("you are 18+");
		}else{
			System.out.print("you are not eligable");	
		}*/
		
		
		System.out.print("Enter yout age");
		 Scanner reader = new Scanner (System.in);
			int num = reader.nextInt();
			
			System.out.println("yout age is "+ num);
			
	    
	    if (num > 18){
	        System.out.println("you are adult "+ num);
	    }else{
	        System.out.println("you are not adult because your age is "+ num);
	    }
	   
	    
	       
	    
	}

}
