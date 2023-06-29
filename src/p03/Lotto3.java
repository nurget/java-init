package p03;

import java.util.Random;
import java.util.Scanner;

// 쪽지시험 로또에서 3문제

public class Lotto3 {

	public static void main(String[] args) {
		int[] lotto = new int[6];  // 컴퓨터의 로또 번호 배열
		int[] lotto2 = new int[6];  // 사용자의 입력 배열
		int count = 0;  // 맞춘 개수를 저장할 변수

		Scanner scanner = new Scanner(System.in);

		Random random = new Random();

		// 컴퓨터의 로또 번호 생성
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		// 사용자로부터 로또 번호 입력 받기
		System.out.println("1-45까지의 숫자를 ,를 기준으로 6개 입력해주세요: ");
		String lottoStr = scanner.nextLine();
		String[] numbers = lottoStr.split(",");

		// 입력된 숫자를 정수로 변환하여 배열에 저장
		for (int i = 0; i < lotto2.length; i++) {
			lotto2[i] = Integer.parseInt(numbers[i].trim());

			if (lotto2[i] < 1 || lotto2[i] > 45) {
				i--;
				continue;
			}

			for (int j = 0; j < i; j++) {
				if (lotto2[j] == lotto2[i]) {
					i--;
					break;
				}
			}
		}

		// 맞춘 번호 개수 세기
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto2.length; j++) {
				if (lotto[i] == lotto2[j])
					count++;
			}
		}

		// 결과 출력
		// 컴퓨터의 로또 번호 출력
		System.out.print("컴퓨터 로또 번호: ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]);
			if (i < lotto.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();

		// 사용자의 로또 번호 출력
		System.out.print("내 로또 번호: ");
		for (int i = 0; i < lotto2.length; i++) {
			System.out.print(lotto2[i]);
			if (i < lotto2.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();

		System.out.println(count + "개를 맞췄습니다!");
	}
}
