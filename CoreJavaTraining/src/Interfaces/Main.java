package Interfaces;

public class Main {
	public static void main(String[] args) {
		Sim sim = new Airtel();
		sim.calling();
		sim.data();
		
		sim.show();
		
		//Default method
		Jio jio = new Jio();
		jio.show();
		
		
		
		//static method executed using Interface only
		Sim.staticMethod();
		
		
	}
}
