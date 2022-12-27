package EmployeeCal;

public class Employee {
	private Integer emp_id;
	private String emp_name;
	private Integer salary;
	
	public Employee(Integer emp_id, String emp_name, Integer salary) {
	
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	}

	
}
