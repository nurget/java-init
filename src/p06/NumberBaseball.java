package p06;

import java.util.Random;
import java.util.Scanner;

public class NumberBaseball {

	public static void main(String[] args) {
		int[] bNum = new int[3];
		int[] bNum2 = new int[3];
		
		Random r = new Random();
		
		for (int i = 0; i < bNum.length; i++) {
			bNum[i] = r.nextInt(10);
			
			for (int j = 0; j < i; j++) {
				if (bNum[i] == bNum[j]) {
					i--;
					break;
				}
			}
		}
		
		bNum = new int[] {5,0,1};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 3개를 , 기준으로 말해주세요: ");
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");
		
		int[] compNums = new int[numStrs.length];
		for (int i = 0; i < numStrs.length; i++) {
			compNums[i] = Integer.parseInt(numStrs[i]);
		}
		
		int strike = 0;
		int ball = 0;
		
		for (int i = 0; i < bNum.length; i++) {
			for (int j = 0; j < compNums.length; j++) {
				if (bNum[i] == compNums[j]) {
					if (i == j) { 
						strike++;
					} else {
						ball++;
					}
					break;
				}
			}
		}
		System.out.println("스트라이크: " + strike);
		System.out.println("볼: " + ball);
		
	}
}
