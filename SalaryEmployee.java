package lv.sandra.employee;

import lv.sandra.paysystem.Payee;

public class SalaryEmployee implements Payee {

	private String name;
	private Integer bankAccount;
	protected Double grossWage;

	public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
		this.name = name;
		this.bankAccount = bankAccount;
		this.grossWage = grossWage;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Double grossPayment() {
		return grossWage;
	}

	@Override
	public Integer bankAccount() {
		return bankAccount;
	}

}
