package p03;

public class AreaTest {

	public static void main(String[] args) {

//		int i; // 변수 선언 후, for문에서 i를 사용하면 for문에서는 i를 쓸 수 없음
//		다중 for문에서도 i 다음 j를 보통적으로 쓰는 이유
		// for문 안에서 i를 선언하지 않아도
		// int i = 1; 을 i가 시작되기 전에만 선언하면 사용 가능

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		int i; // for문 끝나면 for문에 있는 i가 죽기 때문에 다시 선언 가능
	}
}
