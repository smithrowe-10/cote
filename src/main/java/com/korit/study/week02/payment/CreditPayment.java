package ct.week02.payment;

public class CreditPayment implements Payment {

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + "을(를) 신용카드로 결제하였습니다.");
	}
}
