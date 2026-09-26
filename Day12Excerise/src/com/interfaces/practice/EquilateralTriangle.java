package com.interfaces.practice;

public class EquilateralTriangle implements RegularPolygon {
	
	int length;
	
	EquilateralTriangle(int length){
		this.length=length;
	}
	
	public int getNumSides() {
		
		return 3;
	}
	
	public int getNumLength() {
		
		return length;
	}
	


}
