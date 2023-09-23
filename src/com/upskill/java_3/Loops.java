package com.upskill.java_3;

public class Loops {
	
	/* 
	
	Type of Loops
	   1. For Loop
	   2. While Loop
	   3. Do While Loop
	   4. Infinite Loop

	 */




	public static void main(String[] args ) {
		//practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhileLoop();
	    //practiceInfiniteLoop();
		 practiceNestedForLoop();

	}

	public static void practiceForLoop(){          //For Loop = Do again and again upto upper limit
		int i ;                                    //Initialize the variable 
		                                           // Setting lower limit, Upper limit, Increment or Decrement
		                                           //Statement
		for(i = 100; i <=200; i++){
		  System.out.println(i);
	}
	}
	
	public static void practiceWhileLoop(){                     //While Loop = Do again and again upto condition match
		int i = 1;                                              //Initialize the Variables
		while(i<=10){                                           //Setting Condition
			 System.out.println("While Loops Number = " + i);   //Statement
			 i++;                                               //Increment and Decrement
			 
		}
	}
	
	public static void practiceDoWhileLoop(){                   //Do While Loop = Do action then match condition
		int i = 1;                                              //Initialize the variables
		do {                                                    //Statement
			System.out.println("Do While Loops Number = " + i); //Increment and Decrement
			i++;                                                //Checking condition
		} while (i<=0);
		
	}
	
	public static void practiceInfiniteLoop(){
		int i;
		for(i = 1; ; i++){
			System.out.println("Infinite Loops Number = " +i);
		}
		
	}
	
	public static void practiceNestedForLoop(){
		int i;
		int j;
		
		for(i=1; i<=10; i++){
			for (j = 1; j<=10; j++){
				int multiplicationTable = i * j;
				System.out.print(multiplicationTable + " ");
			}
			System.out.println(" ");
		}
	}
}
