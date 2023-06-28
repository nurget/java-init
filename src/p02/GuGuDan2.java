package p02;

import java.util.Scanner;

public class GuGuDan2 {

	public static void main(String[] args) {
		/*
		 * input : 4
		 * 1 X 4 = 4
		 * 2 X 4 = 8
		 * ...
		 * 9 X 4 = 36
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1-9까지 숫자: ");
		String numStr = scan.nextLine();
		System.out.println("니가 입력한 숫자: " + numStr);
		
		for (int i = 1; i < 10; i++) {
			System.out.println( i + " X " + numStr + " = " + Integer.parseInt(numStr) * i );
		}
	}
}
