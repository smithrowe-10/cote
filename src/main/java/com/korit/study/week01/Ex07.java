package ct.week01;
/**
 * 반복문 while, do~while
 */
public class Ex07 {
	public static void main(String[] args) {
		int i = 10, j = 10;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println(j++);
		}while(j > 5);
	}
}
