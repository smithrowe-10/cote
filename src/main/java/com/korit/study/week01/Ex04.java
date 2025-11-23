package ct.week01;
/**
 * 조건문 if
 */
public class Ex04 {
	public static void main(String[] args) {
		int sum = 88;
		if(sum >= 60) System.out.println("합격");
		
		if(sum >= 60) System.out.println("합격");
		else System.out.println("불합격");
		
		if(sum >= 90) System.out.println("A");
		else if(sum >= 80) System.out.println("B");
		else if(sum >= 70) System.out.println("C");
		else System.out.println("F");
		System.out.println("End");
	}
}
