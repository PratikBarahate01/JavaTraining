package EmployeeCal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDao {
	public static List<Employee> empList = new ArrayList<>();
	
	public static List<Employee> getAllEmployees(){
		
				
				Employee e1 = new Employee(1001, "Sas", 20000);
				Employee e2 = new Employee(1002, "Suresh", 13900);
				Employee e3 =new Employee(1003, "Vijay", 20000);
//				new Employee(1004, "Arun", 12000.00),
//				new Employee(1005, "Brijesh", 45800.00),
//				new Employee(1006, "Vivek", 10000.00),
//				new Employee(1007, "Amar", 32000.00),
//				new Employee(1008, "Betal", 13900.89),
//				new Employee(1009, "Vicky", 10000.00),
//				new Employee(1010, "Lokesh", 76000.00),
//				new Employee(1011, "Kamal", 25000.00),
//				new Employee(1012, "Sameer", 12000.25),
//				new Employee(1013, "John", 12000.25),
//				new Employee(1014, "Sonal", 13469.89),
//				new Employee(1015, "Meena", 54899.00),
//				new Employee(1016, "Yasif", 17600.00),
//				new Employee(1017, "Naveen", 1200.00),
//				new Employee(1018, "Sarika", 54000.00),
//				new Employee(1019, "Monal", 1200.00)
				
				empList.add(e1);
				empList.add(e2);
				empList.add(e3);
				return empList;
	}
}
