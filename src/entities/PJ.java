package entities;

public class PJ extends Payer{
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
	public Double totalTax() {
		double totalTax = 0;
		if(employeesNumber > 10) {
			totalTax = getAnualIncome() * 0.14;
		}
		else {
			totalTax = getAnualIncome() * 0.16;
		}
		return totalTax;
	}
	
	
}
