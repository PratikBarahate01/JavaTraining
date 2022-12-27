package mapVsflatmap;

public class Employee {
	private String name;
	private String panno;
	public Employee(String name, String panno) {
		super();
		this.name = name;
		this.panno = panno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	@Override
	public String toString() {
		return "EmployeeDao [name=" + name + ", panno=" + panno + "]";
	}
	
	
}
