package p02;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * 1 X 1 = 1
		 * 1 X 2 = 2
		 * 1 X 3 = 3
		 * ....
		 * 1 X 9 = 9
		 */
		
		String[] strs = new String[10];
		
		for (int i = 1; i < 10; i++) {
			System.out.println(1 + " X " + i + " = " + i);
		}
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i + " X " + 1 + " = " + i);
		}
		
		for (int i = 1; i < 10; i++) {
			System.out.println((10 - i) + " X " + 1 + " = " + (10-i));
		}
	}
}
