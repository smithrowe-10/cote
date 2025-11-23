package ct.week01;
/**
 * break, continue
 */
public class Ex08 {
	public static void main(String[] args) {
		//break
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
			if(i == 50) break;
			
		}
		
		
		//continue
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0) continue;
			System.out.println(i);
		}
	}
}
