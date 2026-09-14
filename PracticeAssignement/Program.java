
class Parent {
	
//	Parent(){
//		System.out.println("This is parent class");
//	}
//	
	void method() {
		System.out.println("This is parent class");
	}
}

class Child extends Parent  {
	
//	Child(){
//		System.out.println("This is child class");
//	}
	@Override
	void method(){
		System.out.println("This is Child class");
	}
	
	void parentMethod() {
		super.method();
	}	  
  }
  
  
  public class Program{

		public static void main(String[] args) {
			Parent p= new Parent();
			p.method();
			
			Child c= new Child();
			c.method();		
			
			
			Child c1= new Child();
			c1.parentMethod();				
		}
	}

