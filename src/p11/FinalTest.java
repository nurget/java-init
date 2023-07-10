package p11;

	// final은 변수, 메서드, 클래스 앞에 붙을 수 있음
	// 메서드 앞에 붙으면 오버라이딩 Xxx / 거의 쓸 일 없음
	// 클래스 앞에 붙으면 상속 Xxx
	// String은 상속이 불가능한 클래스.
	
	class Test {
		public final void test() {
			System.out.println("난 Test꺼!");	
		}
	}
	
	public class FinalTest extends Test {
//		public void test() {
//			System.out.println("난 FinalTest꺼!");
//		}
		
		public static void main(String[] args) {
			int num = 1;
			num = 2;
	}
}
