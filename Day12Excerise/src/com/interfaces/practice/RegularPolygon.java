package com.interfaces.practice;

public interface RegularPolygon {
	
	int getNumSides();
	
	int getNumLength();
	

	public static int TotalSide(RegularPolygon[] polygon) {
		
		int total=0;
		
		for(RegularPolygon e: polygon) {
			
			total=total+e.getNumSides();	
		}
		
		return total;
	}
	
	
	default int getPerimeter() {
		
		int n=getNumSides();
		return n*getNumLength();		
	}	
	
	default double getInteriorAngle() {
		
		int n=getNumSides();
		
		return ((n-2)*3.25/n);
			
	}
	
}





