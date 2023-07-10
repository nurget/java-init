package p11;

// 추상화: 인터페이스 + 클래스 반반 섞은 것
// 메모리 생성 할 수 없음
// 생성자는 만들 수 있음

class Son extends AbstractTest {

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
}

public abstract class AbstractTest {
	public AbstractTest() {
		
	}
	
	public void test() {
		
	}
	
	public abstract void test2();
	
	public static void main(String[] args) {
//		AbstractTest at = new AbstractTest(); //
		AbstractTest at = new Son();
		at.test2();
	}
}
