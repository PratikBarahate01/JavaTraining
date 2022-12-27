package Abstraction;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("John", "Male", 1001);
		emp.work();
		emp.changeName("Victor");
		System.out.println(emp.toString());
		
		//Person p = new Employee()
	}
}
