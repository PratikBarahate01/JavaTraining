package Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	
	public List<Model> getModelList(){
		List<Model> empList = new ArrayList<>();
		empList.add(new Model(1001, "Vrushabh", "Bangalore", 25560.90));
		empList.add(new Model(1002, "Ajay", "Mumbai", 33000.00));
		empList.add(new Model(1003, "Pratik", "Chennai", 55600.90));
		empList.add(new Model(1004, "Ramesh", "Chennai", 55600.90));
		empList.add(new Model(1005, "Sameer", "Bangalore", 55600.90));
		return empList;
	}
}
