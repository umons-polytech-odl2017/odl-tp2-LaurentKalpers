package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	private static int sell=0;
	private int commission;
	private int base_salary;

	public BaseSalaryPlusCommissionEmployee(String name,int base_salary, int commission) {
		this.name=name;
		this.base_salary=base_salary;
		this.commission=commission;
	}

	@Override
	public void sell() {
		sell++;
	}

	@Override
	public int computeSalary() {
		return (base_salary+sell*commission);
	}


}
