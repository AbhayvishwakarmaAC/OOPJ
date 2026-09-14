public class ShapeQ4 {
	
public class Shape {
	
	
	public void print() {
		System.out.println("This is Shape");
	}

};

class Rectanglee extends Shape{
	
	public void printRec() {
		System.out.println("This is Rectangle Shape");
	}
	
};

class Circle extends Shape{
	
	public void printCircle() {
		System.out.println("This is Circle Shape");
	}
	
};

class Square extends Rectanglee{
	
	public void printSquare() {
		System.out.println("Square is a rectangle");
	}
	
};

public static void main(String args[]){
	ShapeQ4 access=new ShapeQ4();
	
	Square square=access.new Square();
	
	square.printSquare();
	square.printRec();
	square.print();
	
	Shape s=access.new Circle();
	// upCasting
	s.print();
	
	Circle c = (Circle) s;
	c.printCircle(); // Downcasting  // Not Recommended 
	
//	Recommended 
	if(s instanceof Circle) {
		Circle c1 = (Circle) s;
		c1.printCircle();
		
		
		Square sq = access.new Square();

		Rectanglee r = sq;
		Shape s1 = sq;
		s1.print(); // upcasting using grand child 
		
		Shape sdown=access.new Square();
		
		Rectanglee r1=(Rectanglee) sdown;
		
		
		Square sqq=(Square) r1;
		sqq.printSquare();  // downcasting
	}
	
	
     }
}


