package Employee;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
	
	
	public static void main(String[] args) {
		Map<String, List<Model>> modelListBasedOnLocation = getModelListBasedOnLocation();

		modelListBasedOnLocation.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+":" + entry.getValue());
		});
	}
	
	public static Map<String, List<Model>> getModelListBasedOnLocation(){
		EmployeeDao dao = new EmployeeDao();
		List<Model> modelList = dao.getModelList();
		
		Map<String, List<Model>> map= modelList.stream().
				collect(Collectors.groupingBy(Model::getLocation, Collectors.toList()));
		return map;
	}
	
	
	
	public static List<Model> getSortedList(){
		EmployeeDao dao = new EmployeeDao();
		List<Model> modelList = dao.getModelList();
		Collections.sort(modelList,(e1, e2)-> e1.getName().compareTo(e2.getName()));
		return modelList;	
	}
}
