package com.ali.learninginharitance;

public class MusicTeacher extends Teacher{
	
	public String mainSubject ="";
	
	//constructor 
	
	public MusicTeacher(){ //constructor is a method with same name as class with no return type
		System.out.println("I am MusicTeacher constructor");
	}
	
	
	public void sayHello() { //void mean blank
		
		System.out.println("I am saying hello to everyone.");
		
	}
	
	
	public int getAmount() {
		return 1000;
	}

}
