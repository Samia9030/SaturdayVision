package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {



	public static void main(String[] args) {

		//Array store multiple data using index

		int age = 30;                                       //Variable
		int[] ageVision = new  int[]{21, 26, 28, 30, 35};   //Array
		
		//Array index                [0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageVision[2]);
		System.out.println("Total student : " + ageVision.length);
		
		
		String [] nameVision = new String [] { "Samia", "Tayeaba", "Ayesha", "Rasel"};
		
		System.out.println("Student Name : " + nameVision[1]);
		System.out.println("Total Student Name : " + nameVision.length);
		
		//Hashmap store multiple data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Tayeaba", 21);
		Student.put("Samia", 31);
		Student.put("Mili", 24);
		Student.put("Samiul", 19);
		Student.put("Riyan", 26);
		
		System.out.println("Hashmap Student Age : " + Student.get("Tayeaba"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("USA", "Washington");
		Capital.put("India", "Delhi");
				System.out.println("Capital: " + Capital.get("Bangladesh"));   
	
		//Hashtable store unordered collection containing unique value, Implementation of Set interface
		
	     Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region: " + Region.get("BD"));
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("Tesla");
		car.add("Toyota");
		car.add("Audi");
		car.add("Honda");
		car.add("BMW");
		
		System.out.println("car: " + car);
		
	}

}
