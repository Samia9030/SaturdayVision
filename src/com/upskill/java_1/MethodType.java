package com.upskill.java_1;

public class MethodType {
	
/*  Types of Methods
    
    1.Void Method
    2.Static Method
    3.Return Type Method
 */

	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		System.out.println("Samia");
		weeklyIncomeStatic()e dx
		
		
		
		MethodType myObj = new MethodType();
		myObj.annualIncomeVoid();
		
		System.out.println("My Monthly Income =" + myObj.monthlyIncomeReturn());


	}
	
	//void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income =" + calculateAnnualIncome);
		
	}
	
	//Static Method
	public static void weeklyIncomeStatic(){
		int calculateweeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income =" + calculateweeklyIncome);
	}
	
	//Return Type Method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}

}
