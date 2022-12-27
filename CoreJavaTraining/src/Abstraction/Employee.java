package Abstraction;

public class Employee extends Person{

	public int empId;
	
	public Employee(String name, String gender, int empId) {
		super(name, gender);
		this.empId = empId;
	}

	@Override
	public void work() {
		if(empId == 0) {
			System.out.println("He is not employee in our company");
		}
		else {
			System.out.println("He is working employee");
		}
	}

}
