package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	private static int sel;
	private int commission;
	private int base_salary;


	public BaseSalaryPlusCommissionEmployee(String name,int base_salary, int commission) {
		this.name=name;
		this.base_salary=base_salary;
		this.commission=commission;
		this.sel=0;
	}


	@Override
	public void sell() {
		sel++;
	}

	@Override
	public int computeSalary() {
		int sal=base_salary+sel*commission;
		return sal;
	}


}
