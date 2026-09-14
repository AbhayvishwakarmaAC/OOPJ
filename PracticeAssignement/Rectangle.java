
public class Rectangle {
	protected int length;
	protected int breadth;
	
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;		
	}
	
	public void Area() {
	    
		System.out.println("Area: "+length*breadth);
	}
	
	public void Perimeter() {
		
		System.out.println("Perimeter: "+2*(length+breadth));
	}
	
	

}
