package com.korit.study.week02.payment;

public class PaymentProcessor {
	public void process(Payment payment, int amount) {
		payment.pay(amount);
	}
}
