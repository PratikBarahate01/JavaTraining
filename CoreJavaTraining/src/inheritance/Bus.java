package inheritance;

public class Bus extends Vehicle{
	private String modelName;
	private String noOfWheels;
	
	public void display() {
		System.out.println("This is Vehicle type "+ type +" With model Name "+ modelName + " and with no of wheels "+ noOfWheels );
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		
		bus.modelName = "Tata";
		bus.noOfWheels = "8";
		bus.type = "Bus";
		bus.display();
	}
}
