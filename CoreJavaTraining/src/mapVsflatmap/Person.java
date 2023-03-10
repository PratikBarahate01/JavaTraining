package mapVsflatmap;

import java.util.List;

public class Person {
	private int id;
	private String name;
	private String email;
	private String location;
	private List<String> phoneNumbers;
	
	
	public Person(int id, String name, String email, String location, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.location = location;
		this.phoneNumbers = phoneNumbers;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", location=" + location + ", phoneNumbers="
				+ phoneNumbers + "]";
	}
	
	
}
