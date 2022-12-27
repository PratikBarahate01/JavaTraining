package Encapsulation;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setName("John");
		e1.setLocation("Bangalore");
		
		System.out.println(e1.getId()+ " " + e1.getName() + " " + e1.getLocation());
	}
}
