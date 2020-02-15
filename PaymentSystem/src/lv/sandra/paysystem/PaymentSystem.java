package lv.sandra.paysystem;

import java.util.ArrayList;

import java.util.List;

public class PaymentSystem {

	public List<Payee> payees;

	public PaymentSystem() {
		payees = new ArrayList<>();
	}

	public void addPayee(Payee payee) {

		if (!payees.contains(payee)) {
			payees.add(payee);

		}
	}

	public void ProcessPayments() {

		for (Payee payee : payees) {

			Double grossPayment = payee.grossPayment();

			System.out.println("Paying to " + payee.name());
			System.out.println("Gross " + String.format ("%1$.2f", grossPayment));
			System.out.println("Transferred to Account: " + payee.bankAccount());

		}
	}

	public void printName() {

		for (Payee payee : payees) {

			System.out.println(payee.name() + " ");

		}
	}

}
