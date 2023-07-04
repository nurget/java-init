package p07;

public class OverLoading {

	public void test() {
		System.out.println("test() 호출");
	}
	
	public void test(byte bt) {
		System.out.println("test(byte bt) 호출");
	}
	
	public void test(short st) {
		System.out.println("test(short st) 호출");
	}
	
	public void test(int num) {
		System.out.println("test(int num) 호출");
	}
	
	public void test(long lg) {
		System.out.println("test(long lg) 호출: " + lg);
	}
	
	public void test(float f) {
		System.out.println("test(float f) 호출");
	}
	
	public void test(double db) {
		System.out.println("test(double db) 호출: " + db);
	}
	
	public void test(char ch) {
		System.out.println("test(char ch) 호출: " + ch);
	}
	
	public void test(String str) {
		System.out.println("test(String str) 호출: " + str);
	}
	
	public void test(boolean b) {
		System.out.println("test(boolean b) 호출");
	}
	
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.test(true);
		ol.test(1000000000000000000L);
		ol.test("123");
	}
}