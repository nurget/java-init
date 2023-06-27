package p01;

public class DataType {
	public static void main(String[] args) {
		char c = '1';
		byte b = 1;
		int i = 1; // int에 byte 넣을 수 있음, int > byte, int를 short에 넣을 수 없음, short < int
		
		// 캐스팅 하는 법
		int ii = 1;
		short s = (short)ii;
		
		int i1 = 1000000000;
		long l = 10000000000L;
		
		float f = 1.1F;
		double d = 1.1;

		boolean b1 = true;
	}
}
