package com.upskill.java_4;

public class Encapsulation {
	
	// Encapsulation used to hide the data using setter and getter method
	
	private String name = "Samia";       //Write & Read
	private int ssn = 123456;            //Write Only
	private String username = "upskill";    //Read Only
	
	
	public static void main(String[] args) { 
		Encapsulation obj = new Encapsulation();
		obj.setSSN(456123657);
		System.out.println(obj.getUsername());
		
		obj.setName("Samia");
		System.out.println(obj.getName());
		
		
	}
	
	
	public void setName(String value){
		name ="Samia";
	}
	
	public String getName(){
		return name;
	}
		
	


	//Setter Method - ssn                    //set the data, Write only
	public void setSSN(int value){
		ssn =value;
	
	
}
	
	//Getter Method - username               // get the data, Read only
	public String getUsername(){
		return username;



	}
	
	
		

	


}
