package Core_java_examples;

public class parameters_arguments {
	
	
	public void test1() {
		int x=10;
		int y=20;
		int c=x+y;
		System.out.println(c);
		//return c;
		
	}
	
	// we cant create method with same name
	public void test1(int x, int y) {
		
		int c=x+y;
		System.out.println(c);
		
	}
	public static void login(String username,int password,int otp) {
		System.out.println(username);
		System.out.println(password);
		System.out.println(otp);
	}
	
	

	public static void main(String[] args) {
		
     login("uday",10,20);
     parameters_arguments obj=new parameters_arguments();
     obj.test1(12, 15);
     obj.test1();
		
	}

}
