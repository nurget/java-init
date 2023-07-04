package p07;

class Coffee {
	public String name;
	public int price;
	
	public String toString() {
		return "name: " + name + ", price: " + price;
	}
}

public class Overriding {
	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		c1.name = "윌리엄 아메리카노";
		c1.price = 20000;
		
		String str = c1.toString();
//		System.out.println(c1.name + "는 " + c1.price +"원 입니다.");
		System.out.println(c1);
	}
}
