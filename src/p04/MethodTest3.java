package p04;

public class MethodTest3 {

	/*
	 * 1. void
	 * 2. 데이터타입
	 * - 기본형
	 * 	. 숫자
	 * 		* 정수: byte, short, int, long
	 * 		* 실수: float, double
	 * 	. 문자: char
	 * 	. 논리: boolean
	 * - 참조형
	 * 	. 기본형 제외 싹 다
	 */
	
	public static void test() {
		
	}
	
	public static int getNum() {
		return 1;
	}
	
	public static void main(String[] args) {
		// void는 method 앞에서만 사용 가능. 형 변환 xxx
//		int i = test(); // 안됨
//		String str = test(); // 안됨
		
		int i = 1000000000;
		long l = 10000000000L; // long인 걸 알기 위해 뒤에 L을 붙여줘야 함.
		
		int num = getNum();
		System.out.println(num);
	}
}
