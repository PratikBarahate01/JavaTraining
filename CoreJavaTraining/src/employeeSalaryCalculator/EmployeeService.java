package employeeSalaryCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeDao.getAllEmployees();
		Map<Employee, List<EmployeeSalary>> salaryMap = new HashMap<>();
		
		Double pfDeduction;
		Double netSalary;
		
		for (Employee employee : employeeList) {
			double salary = employee.getSalary();
			List<EmployeeSalary> salaryDescription = new ArrayList<>();
			if(salary >= 0 && salary <25000) {
				pfDeduction = (salary * 5) / 100;
				netSalary = salary - pfDeduction;
				EmployeeSalary sal = new EmployeeSalary(pfDeduction, netSalary);
				salaryDescription.add(sal);
				
			}
			else if(salary >= 25000 && salary <50000) {
				pfDeduction = (salary * 7) / 100;
				netSalary = salary - pfDeduction;
				EmployeeSalary sal = new EmployeeSalary(pfDeduction, netSalary);
				salaryDescription.add(sal);
			}
			else if(salary >= 50000 && salary <80000) {
				pfDeduction = (salary * 12) / 100;
				netSalary = salary - pfDeduction;
				EmployeeSalary sal = new EmployeeSalary(pfDeduction, netSalary);
				salaryDescription.add(sal);
			}
			else {
				pfDeduction = (salary * 18) / 100;
				netSalary = salary - pfDeduction;
				EmployeeSalary sal = new EmployeeSalary(pfDeduction, netSalary);
				salaryDescription.add(sal);
			}
			salaryMap.put(employee, salaryDescription);
		}
		
		salaryMap.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+", "+entry.getValue());
		});
	}
}
