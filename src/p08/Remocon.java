package p08;

public class Remocon implements Remote {
	@Override // 내 상위에 있는 걸 오버라이드 했다.
	public void on() {
		System.out.println("켭니다.");
	}

	@Override
	public void off() {
		System.out.println("끕니다.");
	}

	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tempUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tempDown() {
		// TODO Auto-generated method stub
		
	}

}
