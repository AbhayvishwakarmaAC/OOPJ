
public class AreaOfTriangle {
	
	public static class Triangle{
		
		private double side1;
		private double side2;
		private double side3;
		
		Triangle(double s1, double s2, double s3){
			side1=s1;
			side2=s2;
			side3=s3;
		}
		
		public double CalculateArea() {
			double s=CalculatePerimeter()/2;
			return Math.sqrt(s*(s-side1)*(s-side2)*(s=side3));
		}

		public double CalculatePerimeter() {
			return (side1+side2+side3);
		}
		
		
	}

	public static void main(String[] args) {
		
		Triangle triangle= new Triangle(3,4,5);
		
		System.out.println("Triangle Area is: "+triangle.CalculateArea());
		System.out.println("Triangle Perimeter is: "+triangle.CalculatePerimeter());
	}

}
