package p03;

import java.util.Random;
import java.util.Scanner;

/*
 * int[] lotto = new int[6]; <-- 만들어서
 * 랜덤이면 메쓰.랜덤이던 로또번호를 6개 만들어서 위에 넣으세요.
 * nextLine에 숫자 6개 입력하면, 몇 개 맞췄는지 출력하는 코드 작성.
 */

public class Lotto3 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int[] lotto2 = new int[6];
		
		int count = 0;
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			for (int j = 0; j < i; j++) {
				
			}
		}
		
		System.out.println("1-45까지 6개의 숫자를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		String lottoStr = scanner.nextLine();

		String[] strs = lottoStr.split(",");
		Random random = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			int rNum = random.nextInt(6) + 1;
			for (int j = 0; j < lotto.length; j++) { // (j)0이 (i)1보다 작은 걸 만족하면 내려감.
				if (lotto[j] == rNum) {
					i--;
					break;
				}
			}

			System.out.println(lotto + "개 맞췄다!");

		}
	}
}
