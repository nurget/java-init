package p04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static int randomNum() {
		Random r = new Random();
		int rNum = r.nextInt(50) + 1;
		return rNum;
	}

	public static boolean match(int num1, int num2) {
		if (num1 == num2) {
			return true;
		}
		if (num1 > num2) {
			System.out.println("UP");
		} else if (num1 < num2) {
			System.out.println("DOWN");
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rNum = randomNum();
		int num = 0;
		/*
		 * rNum과 numStr이 같은 값이라면 맞췄다. rNum이 numStr의 값보다 더 크다면 UP rNum이 numStr의 값보다 더 작다면
		 * DOWN
		 */

		while (!match(rNum, num)) {
			System.out.print("1-50까지 입력하세요 : ");
			String numStr = scan.nextLine();
			num = Integer.parseInt(numStr);
		}
		System.out.println("맞췄다!");
	}
}
