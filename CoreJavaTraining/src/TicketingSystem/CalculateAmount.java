package TicketingSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CalculateAmount {
	
	public static final double TICKET_PER_KILOMETRE_FARE = 5;
	public static void main(String[] args) {
		List<Passenger> allPassengers = PassengerDao.getAllPassengers();
		
		Map<Passenger,Double> result = new HashMap<>();
	
		for (Passenger passenger : allPassengers) {
			double kilometre = passenger.getKilometre();
			Double amount = kilometre * TICKET_PER_KILOMETRE_FARE;
			result.put(passenger, amount);
		}
		
		result.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+" Passenger Fare:"+entry.getValue());
		});
		
//		allPassengers.stream()
//		.collect(Collectors.groupingBy(Function.identity(),Collectors.));
		
	}
}
