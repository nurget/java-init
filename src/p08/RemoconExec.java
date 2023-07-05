package p08;

public class RemoconExec {
	// Remocon을 상속 받고있음, Remocon은 Remote를 상속 받고 있기 때문에 Remote라고 부를 수 있다.
	public static void main(String[] args) {
		AirconRemocon ar = new AirconRemocon();
		ar.AirconRemocon();
		TVRemocon tv = new TVRemocon();
		
		Remote r1 = ar;
		Remote r2 = tv;
		
		Remote[] remotes = new Remote[2];
		remotes[0] = r1;
		remotes[1] = r2;
		
		// 6 - 15 라인까지 3줄로 줄이면
//		Remote[] remotes = new Remote[2];
//		remotes[0] = new AirconRemocon();
//		remotes[1] = new TVRemocon();
		
		for (int i = 0; i < remotes.length; i++) {
			remotes[i].on();
			remotes[i].off();
			if (remotes[i] instanceof AirconRemocon) {
				ar.tempUp();
				ar.tempDown();
			} else if (remotes[i] instanceof TVRemocon) {
				tv.chUp();
				tv.chDown();
			}
		}
	}
}
