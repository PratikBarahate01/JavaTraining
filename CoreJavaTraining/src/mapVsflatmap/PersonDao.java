package mapVsflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonDao {
	
	public static List<Person> getAll(){
		return Stream.of(
				new Person(1001, "Vikas", "vijay@ust.com", "Bangalore", Arrays.asList("9988667755", "8744098799")),
				new Person(1001, "Vikas", "vijay@ust.com", "Bangalore", Arrays.asList("9988667755", "8744098799")),
				new Person(1001, "Vikas", "vijay@ust.com", "Bangalore", Arrays.asList("9988667755", "8744098799")),
				new Person(1001, "Vikas", "vijay@ust.com", "Bangalore", Arrays.asList("9988667755", "8744098799")),
				new Person(1001, "Vikas", "vijay@ust.com", "Bangalore", Arrays.asList("9988667755", "8744098799"))
				
				).collect(Collectors.toList());
	}
}
