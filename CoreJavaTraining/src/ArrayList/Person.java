package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Person {
	
	public static void main(String[] args) {
		Map<Integer, String> nameList = new HashMap<>();
		nameList.put(101, "Vijay");
		nameList.put(102, "Sharath");
		nameList.put(103, "Akash");
		nameList.put(104, "Sonam");
		nameList.put(105, "Roshan");
		nameList.put(106, "sonali");
		
		//int count = 0;
		nameList.forEach((key, value)->{
			if(value.toUpperCase().startsWith("S")) {
				System.out.println("Employee Id:"+key+ ", Employee Name:"+value);
			}
			
			
//			
			
			
				
		});
		
		
		
		//System.out.println("Count of employees whose name starts with S:"+count);
	}
	
}
