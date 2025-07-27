
public class javamethods {
	//Static method
	static void mymethod()
	{
		System.out.println("This is static method ");
		int a = 10;
		int b = 20;
	    int c =  a+ b;
		System.out.println("totla is " + c);
		
		
	}
	// Non static method
	void displaymessage() 
	{
	 
	System.out.println("This is a non-static method" );
		mymethod();
		//System.out.println("hello");
		//return 0;
	 
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//calling static method without using the object  
		//mymethod();
		
		
		//creating an object of the class
		//calling non static method with cls object
		// here "me" is a object to call non static method
		javamethods me =new javamethods();  
		me.displaymessage();
		
	}

}
