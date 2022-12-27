package TicketingSystem;

import java.util.ArrayList;
import java.util.List;

public class PassengerDao {
	public static List<Passenger> passengetList = new ArrayList<>();
	
	public static List<Passenger> getAllPassengers(){
		Passenger p1 = new Passenger(1001, "Sameer", "Hyderabad", "Bangalore", 450);
		Passenger p2 = new Passenger(1002, "Vijay", "Pune", "Mumbai", 1000);
		Passenger p3 = new Passenger(1003, "Komal", "Hyderabad", "Delhi", 257);
		Passenger p4 = new Passenger(1004, "Vaishali", "Nagpur", "Delhi", 879);
		Passenger p5 = new Passenger(1005, "Raj", "Hyderabad", "Bangalore", 1600);
		Passenger p6 = new Passenger(1006, "Kumar", "Kochi", "Hyderabad", 390);
		Passenger p7 = new Passenger(1007, "Navin", "Vizag", "Nagpur", 786);
		Passenger p8 = new Passenger(1008, "Sameer", "Pune", "Bangalore", 357);
		Passenger p9 = new Passenger(1009, "Kaustubh", "Nagpur", "Mumbai", 890);
		Passenger p10 = new Passenger(1010, "naresh", "Hyderabad", "Bangalore", 346);
		passengetList.add(p1);
		passengetList.add(p2);
		passengetList.add(p3);
		passengetList.add(p4);
		passengetList.add(p5);
		passengetList.add(p6);
		passengetList.add(p7);
		passengetList.add(p8);
		passengetList.add(p9);
		passengetList.add(p10);
		
		return passengetList;
	}
	
	
}
