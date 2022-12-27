package EmployeeCal;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Integer sumOfOdd = list.stream()
			.filter(n->n%2!=0)
			.reduce(0, (first, next) -> first + next);
		
		System.out.println("Sum of odd number:"+sumOfOdd);
		
	}
	
}
