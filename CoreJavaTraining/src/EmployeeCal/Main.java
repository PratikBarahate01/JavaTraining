package EmployeeCal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {

		List<Employee> allEmployees = EmployeeDao.getAllEmployees();

		for (int i = 0; i < allEmployees.size(); i++) {
			for (int j = i+1; j < allEmployees.size(); j++) {
				
				if (allEmployees.get(i).getSalary()==allEmployees.get(j).getSalary()) {
					int d = allEmployees.get(i).getSalary() + allEmployees.get(j).getSalary();
					allEmployees.get(i).setSalary(d);
					allEmployees.remove(j);
					
				}
			}
			
			//allEmployees.sort(Comparator.comparing(Employee::getEmp_id));
		}

	System.out.println(allEmployees);
//		
//		 allEmployees.stream().collect(Collectors.groupingBy(Employee::getSalary)))
	}

	

}
