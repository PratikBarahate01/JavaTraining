package mapVsflatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidatePAN {
	public static void main(String[] args) {
		
		String panCardPattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		List<Employee> allEmployees = EmployeeDao.getAllEmployees();
		
		List<Employee> validPanEmployees = allEmployees.stream().filter(employee->employee.getPanno().length()==10)
			.filter(employee->Pattern.matches(panCardPattern, employee.getPanno()))
			.collect(Collectors.toList());
		
		List<Employee> inValidPanEmployees = allEmployees.stream().filter(employee->employee.getPanno().length()==10)
				.filter(employee->Pattern.matches(panCardPattern, employee.getPanno())==false)
				.collect(Collectors.toList());
		
		System.out.println(validPanEmployees);
		System.out.println(inValidPanEmployees);
		
			
	}
	
	
	
//	List<Employee> notValid = new ArrayList<>();
//	
//	for(Employee emp : validPanEmployees)
//	if(allEmployees.contains(emp)==false) {
//		notValid.addAll(allEmployees);
//	}
//	
//	System.out.println(validPanEmployees);
//	System.out.println(notValid);
}
