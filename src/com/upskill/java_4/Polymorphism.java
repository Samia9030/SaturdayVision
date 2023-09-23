package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	

/* 	Polymorphism is the ability of an object to take on many forms.
   - Method Overloading (Compile time Polymorphism/Static binding) 
                           Same method name with different signature to overload
   - Method Overridding (Runtime Polymorphism/Dynamic binding) 
                           Same method name from Parent class to override

 
 */
	
	

	public static void main(String[] args) {
		
		car();
		car("Blue");
		car(4);
		car ("Blue", 4);
	    weeklyIncomeStatic();
	
	}
	
   //Method Overloading- Compile time Polymorphism - Static Binding
   //Same method name with different signature
		
	public static void weeklyIncomeStatic() {
		int calculateWeeklyIncome = hourlyIncome * 40;
		int RealEstateIncome = 1400;
		int totalIncome = calculateWeeklyIncome+RealEstateIncome;
		System.out.println("My Weekly Income = " + totalIncome);
		
	}

	public static void car(){
		System.out.println("My car is Audi");
	}
	
	public static void car(String color){
		System.out.println("My car is Audi, my audi color : " + color);
	}
	
	public static void car( int door){
		System.out.println("My car is Audi, my audi door :" + door);
	}
	
	public static void car(String color, int door){
		System.out.println("My car is Audi, my color : " + color + " , my car door : " + door);
	}
	
 


	}


