package p07;

public class Constructure {

	public Constructure() {
		System.out.println("어? 나 불렀어?");
	}
	
	public Constructure(int num) {
		System.out.println("어? int num 불렀어?");
	}
	
	public static void main(String[] args) {
		Constructure c = new Constructure();
	}
}
