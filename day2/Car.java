public class Car extends Automobile {
	
	int noOfSeats;
	String model;
	
	public Car() {
		this.noOfSeats = 5;
		this.model = null;
	}
	
	public void display() {
		super.display();
		System.out.println("NoOfSeats : " + noOfSeats);
		System.out.println("Models : " + model);
	}
	
	}