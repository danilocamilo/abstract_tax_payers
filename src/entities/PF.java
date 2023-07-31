package entities;

public class PF extends Payer{
	
	private double healthExpenses;
	
	public PF() {
	}

	public PF(String name, Double anualIncome, double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double totalTax() {
		double totalTax = 0;
		if (getAnualIncome() < 20000.00) {
			totalTax = getAnualIncome() * 0.15 - healthExpenses * 0.50;
		}
		if (getAnualIncome() >= 20000.00) {
			totalTax = getAnualIncome() * 0.25 - healthExpenses * 0.50;
		}
		if(totalTax < 0.0) {
			totalTax = 0.0;
		}
		return totalTax;
		
		
	}
	
	
	
}
