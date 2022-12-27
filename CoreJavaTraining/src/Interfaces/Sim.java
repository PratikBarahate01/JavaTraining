package Interfaces;

public interface Sim {
	public void calling();
	
	public void data();
	
	default void show() {
		System.out.println("Default method executed...");
	}
	
	static void staticMethod() {
		System.out.println("Static method executed...");
	}
	
}
