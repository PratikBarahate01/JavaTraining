package employeeSorting;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
public static List<Employee> empList = new ArrayList<>();
	
	public static List<Employee> getAllEmployees(){
		Employee e1 = new Employee(111, "Sameer");
		Employee e2 = new Employee(141, "Ramesh");
		Employee e3 = new Employee(101, "Ganesh");
		Employee e4 = new Employee(131, "Ram");
		Employee e5 = new Employee(121, "Bharat");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		return empList;
}
}
