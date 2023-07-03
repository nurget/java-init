package p06;

class Car {
	public String name;
	public static String type; // static 변수는 메모리 생성을 안해도 되서 class 변수라고도 함
}

public class InstanceTest {

	public static void main(String[] args) {
		Car.type = "승용차";
		Car sonata = new Car(); // 참조형은 초기화 할 때 반드시 new를 붙임
		System.out.println(sonata.name); // null, 자바에서 자동으로 초기화
		sonata.name = "소나타";
		System.out.println(sonata.name); // 소나타
		
		Car c = null;
		
		Car car1 = new Car();
		System.out.println(c); // null
		c = new Car();
		System.out.println(c.name); // null
		
		Car c1 = new Car();
		c1.name = "소나타";
		Car c2 = new Car();
		c2.name = "아반떼";
		System.out.println(c2.name);
	}
}
