package p04;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static String getRock() {
		Random random = new Random();
		int rNum = random.nextInt(3);
		if(rNum == 0) {
			return "가위";
		} 
		if (rNum == 1) {
			return "바위";
		}
		if (rNum == 2) {
			return "보";
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		String rock = getRock();
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위,바위,보: ");
		String unRock = scanner.nextLine();
		
		System.out.println("컴퓨터: " + rock);
		System.out.println("나: " + unRock);
		if (rock.equals(unRock)) {
			System.out.println("비겼다!");
		
		} else if(rock.equals(unRock)) {
			System.out.println("졌다!");
		} else {
			System.out.println("이겼다!");
		}
	}
}
