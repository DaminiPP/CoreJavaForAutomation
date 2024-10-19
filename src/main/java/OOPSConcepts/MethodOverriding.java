package OOPSConcepts;

public class MethodOverriding {

	public static void main(String[] args) {
		
		//Polymorphism--one to many
		//Compile time / Static polymorphism
		
		BMWOverriding bmw= new BMWOverriding();
		bmw.start();
		bmw.theSafety();
		bmw.stop();
		bmw.refuel();
		bmw.engine();
		
		System.out.println("******************************************");
        
		CarOverriding car= new CarOverriding();
		car.start();
		car.stop();
		car.refuel();
		//car.theSafety();
		
		
		
		//topcasting
		CarOverriding c1= new BMWOverriding();
		c1.start();
		c1.stop();
		c1.refuel();
		
		
		//child class variable can be referred by parent class refrence variable is called dynamic polymorphism/ Runtime polymorphism
		
		
		//downcasting
		BMWOverriding bmw1= (BMWOverriding)new CarOverriding();

		//classCaseExpression
	}
	
	//when method name is name in both  child and parents class -->preference would be given to child class
	//when same method is present in both child and parent class with same name and same number of arguments is call method overridinf
    //Inheritance-->method overridding	
}

