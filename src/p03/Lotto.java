package p03;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random random = new Random(); // 레귤러 변수 표현법 random
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int rNum = random.nextInt(7) + 1;
			for (int j = 0; j < lotto.length; j++) { // (j)0이 (i)1보다 작은 걸 만족하면 내려감.
				if (lotto[j] == rNum) {
					i--;
					break; // 없어도 동작하긴 함.
				}

			}
			if (lotto[i] == 0) {
				lotto[i] = rNum;
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.println("lotto[" + i + "] : " + lotto[i]);
		}
	}
}
