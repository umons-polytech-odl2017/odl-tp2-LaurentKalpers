package exercise1;

import exercise2.Payable;

public abstract class Employee implements Payable {

	protected String name;

	public int computeSalary() {
		return 0;
	}

	public void sell() { }

	public void workOneHour() { }


	String getName() {
		return name;
	}
}
