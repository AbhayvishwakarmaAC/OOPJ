
public class CalculateArea {

	public static void main(String[] args) {
		System.out.println("Enter the Radius of Circle");
		double radius=ConsoleInput.getDouble();
		
		double Perimeter=(2*radius*3.14);
		double area=(radius*radius*3.14);
		System.out.println("Perimeter is "+Perimeter);
		System.out.println("Area is "+area);
	}

}
