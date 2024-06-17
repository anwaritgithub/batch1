package Core_java_examples;

public class sample_program {
	
	  String name ="testing";
	  static int z=10;
	  public static void addmethod() {
		  int x=10;
		  int y=20;
		  int c=x+y;
		  System.out.println(c);
	  }
	  public void sub() {
		  int x=10;
		  int y=40;
		  System.out.println(x-y);
		 
	  }
	  
	  
	  public static void main(String[] args) {
		
		  sample_program  obj=new sample_program ();
		  obj.sub();
		  addmethod();
		  System.out.println(z);
		  
	}
}
