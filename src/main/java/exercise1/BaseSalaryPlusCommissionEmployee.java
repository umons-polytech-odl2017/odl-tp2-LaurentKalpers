package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	private int sel=0;
	private int commission;
	private int base_salary;


	public BaseSalaryPlusCommissionEmployee(String name,int base_salary, int commission) {
		this.name=name;
		this.base_salary=base_salary;
		this.commission=commission;
	}


	@Override
	public void sell() {
		sel++;
	}

	@Override
	public int computeSalary() {

		return (base_salary+sel*commission);
	}


}
