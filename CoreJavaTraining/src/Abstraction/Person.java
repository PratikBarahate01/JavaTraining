package Abstraction;

public abstract class Person {
	private String name;
	private String gender;
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public abstract void work();

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}
	
	
}
