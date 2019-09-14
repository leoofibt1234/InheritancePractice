package com.ali.learninginharitance;

public class Testing {

	public static void main(String[] args) {
		
		
		MusicTeacher musicTeacher = new MusicTeacher(); //constructor
		
	
		findFactorial(10);
		
	    //return type and void
		
		//parameter input
		
		
	}
	
	
	private static int findFactorial(int num) {
		
		int result=1;
		
		//5 = 5x4x3x2x1
		
		for(int i=1;i<=num;i++) {
			
			result = result * i;
			
		}
		
		return result; //
	}
	
	
}
