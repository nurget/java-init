package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		/*
		 * numList의 size가 50이 될때까지 추가를 해주세요.
		 * 값은 1부터 200까지의 랜덤값인데
		 * 중복은 안되며
		 * 값이 홀수 일 경우에만 추가합니다.
		 */
		Random r = new Random();
		while(numList.size()<50) {
			int rNum = r.nextInt(200)+1;
			if(rNum % 2 == 1 && numList.indexOf(rNum)==-1) {
				numList.add(rNum);
			}
		}
		System.out.println(numList);
	}
}
