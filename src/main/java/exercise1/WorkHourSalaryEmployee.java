package exercise1;

public class WorkHourSalaryEmployee extends Employee {
	private int hourRate;
	private static int  hoursdone=0;
	@Override
	public void workOneHour() {

		hoursdone++;
	}

	public WorkHourSalaryEmployee(String name,int hourRate) {
		this.name=name;
		this.hourRate=hourRate;
	}

	@Override
	public int computeSalary() {
		return (hoursdone*hourRate);
	}
}
