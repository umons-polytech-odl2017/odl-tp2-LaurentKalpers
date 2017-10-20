package exercise1;

public class FixedSalaryEmployee extends Employee {
	private int salaire;

	public FixedSalaryEmployee(String name,int fixedSalary) {
	this.name=name;
	this.salaire=fixedSalary;
	}

	public int computeSalary() {
		return salaire;
	}
}
