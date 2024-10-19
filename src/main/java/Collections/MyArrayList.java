package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyArrayList {

	public static <E> void main(String[] args) {
		int a[]= new int[3]; //static Array ---size is fixed
		//Dynamic Array---ArrayList
		
		 ArrayList ar = new ArrayList();
		 ar.add(100);
		 ar.add(200);
		 ar.add(300);
		 System.out.println(ar.size());
		 ar.add(400);
		 ar.add(500);
		 System.out.println(ar.size());
		 
		 ar.add(500);
		 ar.add("Shreyas");
		 ar.add("Damini");
		 ar.add(1);
		 ar.add('S');
		 System.out.println(ar.size());//size of arraylist
		 
		 
		 //Properties
		 //It can contains duplicate values
		 //It maintains insertion order
		 //It is not synchronise-- not thread safe
		 //It allows random access ----it stores value in indexes
		 
		 System.out.println(ar.get(3));  //to get value from index
		 System.out.println(ar.indexOf(300)); 
		 
		 //to print all values from arraylist use 
		 //forloop
		 //Iterator
		 
		 
		 for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		 }
		 
		 
		 //Genric Vs Non Generic
		 
		 ArrayList<Integer> ar1= new  ArrayList<Integer>();
		 ar1.add(100);
		 ar1.add(300);
		 ar1.add(400);
		 ar1.add(500);
		 ar1.remove(3);
		 for(int i=0; i<ar1.size();i++) {
				System.out.println(ar1.get(i));
				System.out.println("{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{");
			 }

		 ArrayList<String> ar2= new  ArrayList<String>();
		 ar2.add("Shreyas");
		 ar2.add("Damini");
		 ar2.add("Selenium");
		 ar2.add("Java");
	
		 
		 
		 //when we are not sure which type of data we would expect
		 
		 ArrayList<E> ar3= new  ArrayList<E>();
		 
		 System.out.println("****************************");
		 
		 Employee emp1= new Employee("Damini", 10, "QA");
		 Employee emp2= new Employee("Shreyas", 40, "Dev");
		 Employee emp3= new Employee("Tom", 30, "Admin");
		 
		 ArrayList<Employee> ar4= new  ArrayList<Employee>();
		 ar.add(emp1);
		 ar.add(emp2);
		 ar.add(emp3);
	
		 
		 Iterator<Employee> it =ar4.iterator();
		 while(it.hasNext()) {
			 Employee emp= it.next();
			 System.out.println(emp.name);
			 System.out.println(emp.age);
			 System.out.println(emp.dept);
		 }
		 
		 System.out.println("******************************************");
		 
		 ArrayList<String> ar5= new ArrayList<String>();
		 ar5.add("ABC");
		 ar5.add("PQR");
		 ar5.add("STU");
		 
		 ArrayList<String> ar6= new ArrayList<String>();
		 ar6.add("Pink");
		 ar6.add("Yellow");
		 ar6.add("Green");
		 
		 
		 //Add All
		 ar5.addAll(ar6);
		 
		 for(int i=0; i<ar5.size(); i++) {
			 System.out.println(ar5.get(i));
		 }
		 
		 
		 //RemoveAll
		 ar5.removeAll(ar6);
		 
		 for(int i=0; i<ar5.size(); i++) {
			 System.out.println(ar5.get(i));
		 }
		 
		 
		 //retainAll---> to retain commom values
		 
		 
		 ArrayList<String> ar7= new ArrayList<String>();
		 ar7.add("Test");
		 ar7.add("Selenium");
		 ar7.add("QTP");
		 
		 ArrayList<String> ar8= new ArrayList<String>();
		 ar8.add("Test");
		 ar8.add("Java");
		 ar8.add("Dev");
		 
		 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		 
		 ar7.retainAll(ar8);
		 
		 for(int i=0; i<ar7.size();i++) {
			 System.out.println(ar7.get(i));
		 }
		 
		System.out.println("Creating a new Array LIst ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		 
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("Selenium");
		 list.add("Java");
		 list.add("QTP");
		 list.add(".net");
		 list.add("Database");
		 list.add("Testing");
		 list.add("cloud");
		 
		 System.out.println("Printing list of elements in arraylist directly "+list);
		 
		 for(int i=0; i<list.size(); i++) {
			 System.out.println("Printing list of elements in arraylist directly "+list.get(i));
		 }
		 
		 Iterator<String> itt = list.iterator();
		 
		 while(itt.hasNext()) {
			 System.out.println(itt.next());
		 }
		 System.out.println("Throgh Iterator "+itt);
		 
			
		
		 
		 
		 
		 
		 
	}


}
