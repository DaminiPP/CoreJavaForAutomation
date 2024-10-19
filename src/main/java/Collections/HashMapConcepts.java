package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcepts {

	public static void main(String[] args) {
	       //HashMap is a class and implements Map Interface
		   //Extends AbstractMap
		//It contains unique elements
		//It stores value in the form of Key and Value
		//It may have one null key and multiple null values
		// It maintains no order
		//Hashmap is non snychronise
		
		HashMap<Integer, Employee> emp= new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Tom" , 25,  "admin");
		Employee e2 = new Employee("Jerry" , 26,  "QA");
		Employee e3 = new Employee("Peter" , 27,  "DEV");	
		Employee e4 = new Employee("Sassy" , 28,  "DB");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);
				
		for(Entry <Integer, Employee> m : emp.entrySet()) {
			int key= m.getKey();
			Employee e= m.getValue();
			
			System.out.println(key + "Info");
			System.out.println(e.name +" " + e.age + " "  +e.dept);
		}
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "JAVA");
		hm.put(3, "QTP");
		hm.put(4, ".Net");
		System.out.println(hm.get(3));
		
		System.out.println(hm.get(9));
		
		//Printing all the elements 
		
		for(Entry m :hm.entrySet()) {
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
		//Removing all key
		
		hm.remove(2);
		
		for(Entry m :hm.entrySet()) {
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
		System.out.println(hm);
		
		
		
		
	}

}
