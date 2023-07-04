package p07;

public class WhyOverLoading {

	public void intTest(int num) {
		System.out.println("test(int num) 호출");
	}
	
	public void test() {
		System.out.println("test() 호출");
	}
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println('1');
		System.out.println("1");
		System.out.println(1.1);
		System.out.println(1.1F);
		System.out.println((short)1);
		
		WhyOverLoading wol = new WhyOverLoading();
	}
}
