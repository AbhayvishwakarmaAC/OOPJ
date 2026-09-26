package com.interfaces.practice;

public class Square implements RegularPolygon {
	

	int length;
	
	Square(int length){
		this.length=length;
	}
	
	public int getNumSides() {
		
		return 4;
	}
	
	public int getNumLength() {
		
		return length;
	}
	
	
	

}
