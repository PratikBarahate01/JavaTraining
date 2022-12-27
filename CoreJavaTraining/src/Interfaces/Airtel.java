package Interfaces;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("I am using airtel sim for calling");
		
	}

	@Override
	public void data() {
		System.out.println("I am using airtel sim for data");
		
	}

}
