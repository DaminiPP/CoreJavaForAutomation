package OOPSConcepts;

public class CarOverriding extends VehicleOverriding{
	
	public void start() {
		System.out.println("Car Class ---Start Method");
	}
	
    public void stop() {
		System.out.println("Car Class ---Stop Method");
	}

    public void refuel() {
	    System.out.println("Car Class ---Refuel Method");
}

}
