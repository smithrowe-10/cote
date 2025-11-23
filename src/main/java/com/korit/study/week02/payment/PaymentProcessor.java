package ct.week02.payment;

public class PaymentProcessor {
	public void process(Payment payment, int amount) {
		payment.pay(amount);
	}
}
