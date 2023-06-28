package p02;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1-9까지 숫자: ");
		String numStr = scan.nextLine();
		System.out.println("니가 입력한 숫자: " + numStr);
		
		/* 앞 숫자에 따라 단이 달라짐, 2 넣으면 2단, 7 넣으면 7단
		 * 2 X 1 = 1
		 * 2 X 2 = 2
		 * 2 X 3 = 6
		 * ...
		 * 2 X 9 = 18
		 */
//		int num = Integer.parseInt(numStr);
		for (int i = 1; i < 10; i++) {
			System.out.println( numStr + " X " + i + " = " + Integer.parseInt(numStr) * i );
		}
	}
}
