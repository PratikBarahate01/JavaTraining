package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Vijay");
		list.add("John");
		list.add("Annie");
		list.add("Tom");
		System.out.println(list);
		list.add("John");
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			String name = (String)itr.next();
			System.out.println(name);
		}
	}
}
