package lv.sandra.employee;

public class CommisionEmployee extends Employee {

	private Double grossCommision = 0.0;
	
	private static final Double BONUS_MULTIPLIER = 1.5;

	public CommisionEmployee(String name, Integer bankAccount, Double grossWage) {
		super(name, bankAccount, grossWage);

	}

	@Override
	public Double grossPayment() {
		return grossWage + doCurrentCommision() + doCurrentBonus();
	}

	private Double doCurrentCommision() {
		Double commision = grossCommision;
		//grossCommision = 0.0;
		return commision;
	}

	public void giveCommision(Double amount) {
		grossCommision += amount;

	}

	@Override
	public void giveBonus(Double percentage) {
		currentBonus += grossWage * (percentage/100) *  BONUS_MULTIPLIER;
				
	}

}
