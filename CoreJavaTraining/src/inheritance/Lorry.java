package inheritance;

public class Lorry extends Vehicle{
	private String modelName;
	private String noOfWheels;
	
	public void display() {
		System.out.println("This is Vehicle type "+ type +" With model Name "+ modelName + " and with no of wheels "+ noOfWheels );
	}
	
	public static void main(String[] args) {
		Lorry lorry = new Lorry();
		
		lorry.modelName = "Mahindra";
		lorry.noOfWheels = "6";
		lorry.type = "Lorry";
		lorry.display();
	}
}
