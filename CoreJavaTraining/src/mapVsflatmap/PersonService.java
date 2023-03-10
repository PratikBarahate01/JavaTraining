package mapVsflatmap;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonService {
	public static void main(String[] args) {
		List<List<String>> mapList = PersonDao.getAll().stream()
			.map(person->person.getPhoneNumbers()).collect(Collectors.toList());
		
		List<String> flatMapList = PersonDao.getAll().stream().flatMap(person->person.getPhoneNumbers().stream())
			.collect(Collectors.toList());
		//System.out.println(mapList);
		//System.out.println(flatMapList);
		

		//Optional
		List<String> namesList = PersonDao.getAll().stream().map(person->person.getName())
		.collect(Collectors.toList());
		
		//List<String> namesList = null;
		
		Optional<List<String>> employeeNames = Optional.ofNullable(namesList);
		int size = employeeNames.map(List::size).orElse(0);
		System.out.println("Size of employees:"+size);
		
		
		
	}
}
