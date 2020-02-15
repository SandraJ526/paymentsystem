package lv.sandra.test;

import lv.sandra.employee.CommisionEmployee;
import lv.sandra.employee.SalaryEmployee;
import lv.sandra.paysystem.PaymentSystem;

public class TestPayment {

	public static void main(String[] args) {
		
		PaymentSystem paymentSystem = new PaymentSystem();
		
		CommisionEmployee toms = new CommisionEmployee("Toms Ozolins", 1010101, 5000.5);
		paymentSystem.addPayee(toms);
		
		CommisionEmployee ieva = new CommisionEmployee("Ieva Berzina", 2020202, 5600.5);
		paymentSystem.addPayee(ieva);
		
		SalaryEmployee janis = new SalaryEmployee ("Janis Krumins", 3030303, 3000.6);
		paymentSystem.addPayee(janis);
		
		SalaryEmployee liga = new SalaryEmployee ("Liga Zarina", 4040404, 3300.6);
		paymentSystem.addPayee(liga);
		
		toms.giveCommision(4.0);
		toms.giveCommision(50.3);
		
		janis.giveBonus(10.0);
		ieva.giveBonus(7.0);
		ieva.giveCommision(40.2);
		toms.giveCommision(4.0);
		toms.giveCommision(52.3);
		ieva.giveCommision(40.2);
		
		paymentSystem.ProcessPayments();
		paymentSystem.printName();
		
		
		
		
	}

}
