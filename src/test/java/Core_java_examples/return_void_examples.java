package Core_java_examples;

public class return_void_examples {
	
	
	
//	public static int Birthday()
//	{
//		int x=10;
//		int y=10;
//		int c=x+y;
//		System.out.println(c);
//		return y;
//	}
//	public static boolean add()
//	{
//		int a=10;
//		int b=20;
//		int c=a+b;
//		System.out.println(c);
//		return true;
//		
//	}
	
	
	
	public char gender() {
		
		return 'a';
		
	}
	public static char gen()
	{
		return 'z';
	}
	
	public char g(char a) {
		return a;
	}
	
	public static void main(String[] args) {
		
//	int z=Birthday();
//	System.out.println(z);
//	System.out.println(add());
//	
		System.out.println(gen());
		return_void_examples ob= new return_void_examples();
		System.out.println(ob.gender());
		System.out.println(ob.g('o'));
		
	}
}
