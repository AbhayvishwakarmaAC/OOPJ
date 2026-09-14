
public class AreaOfRectangle {
	
	public static class Rectangle{
		private double length;
		private double breadth;
		
		Rectangle(double l, double b){
			length=l;
			breadth=b;
		}
		
		public double Area() {
			return (length*breadth);
		}

		public double getLength() {
			return length;
		}

		public double getBreadth() {
			return breadth;
		}	      
		
	}

	public static void main(String[] args) {
		
		Rectangle T1= new Rectangle(4,5);
		Rectangle T2= new Rectangle(5,8);
		  
		System.out.println("The Area of T1: "+T1.Area());
		System.out.println("The Length and Breadth of T1 are : "+T1.getLength()+" "+T1.getBreadth());
		System.out.println("The Area of T2: "+T2.Area());
		System.out.println("The Length and Breadth of T1 are : "+T2.getLength()+" "+T2.getBreadth());
		
		

	}

}
