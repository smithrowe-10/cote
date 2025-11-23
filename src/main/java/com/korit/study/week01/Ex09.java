package ct.week01;
/**
 * break label
 */
public class Ex09 {
	public static void main(String[] args) {
		bl:while(true) {
			for(int i = 0; i < 100; i++) {
				if(i == 50) break bl;
				System.out.println(i);
			}
		}
	}
}
