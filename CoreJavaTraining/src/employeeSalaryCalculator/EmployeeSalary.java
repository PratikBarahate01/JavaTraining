package employeeSalaryCalculator;

public class EmployeeSalary {
	private double pfDeduction;
	private double netSalary;

	public EmployeeSalary(double pfDeduction, double netSalary) {
		super();
		this.pfDeduction = pfDeduction;
		this.netSalary = netSalary;
	}

	public double getPfDeduction() {
		return pfDeduction;
	}

	public void setPfDeduction(double pfDeduction) {
		this.pfDeduction = pfDeduction;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "EmployeeSalary [pfDeduction=" + pfDeduction + ", netSalary=" + netSalary + "]";
	}

}
