package p07;

class Mother {
	public void work() {
		System.out.println("어머님이 집안일을 하십니다.");
	}
}
class Daughter extends Mother {
	public void work() {
		System.out.println("딸이 출근을 합니다.");
	}
	
	public void work(String job) {
		System.out.println("딸이 " + job + "을 합니다.");
	}
}

public class Overriding2 {
	public static void work(Mother[] ms) {
		for (int i = 0; i < ms.length; i++) {
			Mother m = ms[i];
			// m이 Daughter라고 불릴 수 있다면 
			// 딸이 개발을 합니다. 출력
			// 캐스팅
			if (m instanceof Daughter) { // m은 Daughter로 불릴 수 있나요?
				Daughter d = (Daughter)m;
				d.work("개발");
			}
			
		}
	}
	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.work();
		
		Mother m = new Mother();
		
//		Mother m1 = new Daughter(); 메모리는 Daughter를 바라보고 있기 때문에 같은 work여도 Daughter의 work()가 실행
		
		Mother[] ms = new Mother[2];
		ms[0] = d;
		ms[1] = m;
		
		m.work();
		System.out.println(d instanceof Mother); // d 변수 Mother 라고 불러도 되니? / 출력: true
		System.out.println(m instanceof Mother); // m 변수 Mother 라고 불러도 되니? / 출력: true
		
		System.out.println(d instanceof Daughter); // true
		System.out.println(m instanceof Daughter); // false
	}
}
