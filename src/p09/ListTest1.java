package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		/*
		 * 반복문을 6번 돌려서 랜덤값을 numList에 추가해주세요.
		 * 단 랜덤값은 중복이 불가능합니다.
		 */
		Random r = new Random();
		while(numList.size()<6) {
			int rNum = r.nextInt(100)+1;
			if(numList.indexOf(rNum)==-1) {
				numList.add(rNum);
			}
		}
		System.out.println(numList);
		//
		int min = numList.get(0);
		int max = numList.get(0);
		for(int i=1;i<numList.size();i++) {
			if(min>numList.get(i)) {
				min = numList.get(i);
			}
			if(max<numList.get(i)) {
				max = numList.get(i);
			}
		}
		System.out.println("min : " + min);
		System.out.println("max : " + max);
	}
}
