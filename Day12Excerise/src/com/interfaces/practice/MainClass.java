package com.interfaces.practice;

public class MainClass {

	public static void main(String[] args) {
	   
		EquilateralTriangle trianlge= new EquilateralTriangle(5);
		
		Square sqare= new Square(4);
		
		
		RegularPolygon ploygon[]={trianlge,sqare};

		
		
		System.out.println("Total value: "+RegularPolygon.TotalSide(ploygon));
		
		System.out.println("Peri Menter value Square : "+sqare.getPerimeter());
		
		System.out.println("Total value getInteriorAngle Suare: "+sqare.getInteriorAngle());
		
		System.out.println("Peri Menter value Triangle : "+trianlge.getPerimeter());
		
		System.out.println("Total value getInteriorAngle Triangle: "+trianlge.getInteriorAngle());
		

	}

}
