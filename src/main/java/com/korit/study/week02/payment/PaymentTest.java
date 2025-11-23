package ct.week02.payment;

public class PaymentTest {
	public static void main(String[] args) {
		PaymentProcessor process = new PaymentProcessor();
		
		Payment p1 = new CreditPayment();
		Payment p2 = new PaypalPayment();
		process.process(p1, 100);
		process.process(p2, 200);
	}
}
