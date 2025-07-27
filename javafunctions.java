
public class javafunctions {

		public static int calculatesum(int a, int b) {
			int sum = a + b;
			return sum;
		}
		
		public static int multi(int a, int b) {
			return 10*10;
		
		}
		void subs(int a, int b, int c) {
			c = 10-10;
			System.out.println(c);
		}
		
		void divi(){
			int a = 100;
			int b = 2;
			int c= a/b;
			System.out.println(c);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		int c = calculatesum( a,  b);
		System.out.println(c);
		
		//int d = multi(10, 10);
		System.out.println(multi(a,b));
		
		javafunctions me = new javafunctions();
		me.subs( a, b,  c);
		//System.out.println(me);
		
		javafunctions mea = new javafunctions();
		mea.divi();
		
		
	}
}

