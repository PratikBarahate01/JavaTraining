package FunctionalInterface;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
	public static void main(String[] args) {
//		Consumer<Integer> consumer = val -> System.out.println("Output is:"+val); 
//		consumer.accept(100);
		
		List<String> namesList = Arrays.asList("pratik", "sam", "vijay");
		namesList.stream().forEach(name ->{
			getName(()->name);
		});
	}
	
	static void getName(Supplier<String> supplier) {
		System.out.println(supplier.get());
	}
}
