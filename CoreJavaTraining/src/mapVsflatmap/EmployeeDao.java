package mapVsflatmap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public static List<Employee> empList = new ArrayList<>();
	
	public static List<Employee> getAllEmployees(){
		empList.add(new Employee("Pratik", "CKSPB9336G"));
		empList.add(new Employee("Vikram", "ASD1234C67"));
		empList.add(new Employee("Samar", "BACBA1256D"));
		return empList;
	}
}
