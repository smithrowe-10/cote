package ct.week01;
/**
 * 자료형
 */
public class Ex02 {
	public static void main(String[] args) {
		//정수
		//1byte = 8bit
		byte b = 0;	//1byte(-128~127)
		char c1 = 'A', c2 = 65; //2byte(0~65535)
		char c3 = '0', c4 = 48;
		short s = 100;	//2byte(-32768~32767)
		int  i = 65;	//4byte(-214**8*~214***7)
		long l = 10000000000000L; //8byte
		
		//실수
		float f = 3.14F;//4byte
		double d = 3.141592;//8byte;
		
		//논리
		boolean t = false; //1bit(1byte)
	}
}
