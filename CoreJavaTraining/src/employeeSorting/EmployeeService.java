package employeeSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class EmployeeService {
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDao.getAllEmployees();
		System.out.println(employeeList);
		
		
		List<Employee> sortedList = new ArrayList<>();
		
		
		int pos;
		int temp;
		for (int i = 0; i < employeeList.size(); i++) {
			
			pos = i;
			int first = employeeList.get(i).getId();
			System.out.println("First:"+first);
			for (int j = i+1; j < employeeList.size(); j++) {
				
				if(employeeList.get(j).getId()<employeeList.get(pos).getId()) {
					pos = j;
					
				}
				
			}
			
			temp = employeeList.get(pos).getId();
			employeeList.get(pos);
			
		}
		
		System.out.println(sortedList);
		
	}
}
