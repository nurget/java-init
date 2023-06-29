package p04;

class Test {
	public static int getNum() {
		return 1;
	}
	
	public static int getNum2() {
		return 2;
	}
}

public class MethodTest {
	// void 없어, 리턴해야 함.
	public static int getNum() {
		return 0;
	}
	
	public static String getStr() {
		return "";
	}
	
	public static void test() {
		return; // void도 return은 됨. 무언가를 return 할 수 없음. void라는 데이터 타입과 맞지 않기 때문에
	}

	public static void main(String[] args) {
		int a = 1;
		int b = Test.getNum2();
		String str = getStr();
	}
}
