package employeeSalaryCalculator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public static List<Employee> empList = new ArrayList<>();
	
	public static List<Employee> getAllEmployees(){
		Employee e1 = new Employee(1001, "Sameer", "Bangalore", 15600.00);
		Employee e2 = new Employee(1002, "Ramesh", "Pune", 25000.00);
		Employee e3 = new Employee(1003, "Ganesh", "Nagpur", 55000.00);
		Employee e4 = new Employee(1004, "Ram", "Chennai", 80000.00);
		Employee e5 = new Employee(1005, "Bharat", "Trivendrum", 95000.00);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		return empList;
	}
}
