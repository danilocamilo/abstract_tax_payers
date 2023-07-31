package entities;

public class PJ extends Payer {
	private int employeesNumber;

	public PJ() {
	}

	public PJ(String name, Double anualIncome, int employeesNumber) {
		super(name, anualIncome);
		this.employeesNumber = employeesNumber;
	}

	public int getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public double totalTax() {
		if (employeesNumber > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
	}

}
