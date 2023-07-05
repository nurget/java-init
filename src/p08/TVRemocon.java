package p08;

public class TVRemocon extends Remocon {
	// TVRemocon, Remocon, Remote, Object
	public void on() {
		System.out.println("TV를 켭니다.");
	}
	
	public void off() {
		System.out.println("TV를 끕니다.");
	}
	
	public void chUp() {
		System.out.println("TV 채널을 올립니다.");
	}
	
	public void chDown() {
		System.out.println("TV 채널을 내립니다.");
	}
}
