package ct.week02;
/**
 * 추상클래스를 이용한 Extends
 * 
 */

abstract class Phone{
	private String number = "010-1234-5678";
	
	public abstract void call();
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	} 
}

class PublicPhone extends Phone{

	@Override
	public void call() {
		System.out.println(this.getName() + "에서 " 
	+ this.getNumber() +"로 전화를 겁니다.");
	}
	
	public String getName() {
		return "공중전화";
	}
	
}

class SmartPhone extends Phone{
	@Override
	public void call() {
		System.out.println(this.getName() + "에서 " 
	+ this.getNumber() +"로 전화를 겁니다.");
	}
	
	public String getName() {
		return "스마트폰";
	}
}

public class CallPhone {
	public static void main(String[] args) {
		PublicPhone p1 = new PublicPhone();
		SmartPhone p2 = new SmartPhone();
		p1.call();
		p2.call();
		
		Phone p3 = p1;
		Phone p4 = p2;
		p3.call();
		p4.call();
	}
}
