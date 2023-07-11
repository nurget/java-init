package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		/*
		 * numList의 size가 20이 될때까지
		 * 랜덤값을 1-100까지 추가합니다.
		 * 단 중복은 안됩니다.
		 */
		Random r = new Random();
		while(numList.size()<20) {
			int rNum = r.nextInt(100)+1;
			if(numList.indexOf(rNum)==-1) {
				numList.add(rNum);
			}
		}
		/*
		 * 반복문을 사용하여 1개씩 출력하시고
		 * 숫자에 3,6,9가 있을 경우 짝을 출력하시면 됩니다. 
		 * 3, 13, 23, 33, 43, 53, 63... 93
		 * 6, 16, 26, 36, 46, 56, 66... 96
		 * 9, 19, 29, 39, 49, 59, 69... 99
		 */
		for(int i=0;i<numList.size();i++) {
			int num = numList.get(i);
			
			int mod = num % 10;
			int quo = num / 10;
			if(mod == 3 || mod ==6 || mod == 9 || quo == 3|| quo == 6|| quo == 9) {
				if((mod == 3 || mod ==6 || mod == 9) && (quo == 3|| quo == 6|| quo == 9) ) {
					System.out.println(num +" : 짝짝");
				}else {
					System.out.println(num +" : 짝");
				}
			}else {
				System.err.println(num);
			}
		}

		for(int i=0;i<numList.size();i++) {
			String numStr = numList.get(i).toString();
			numStr = numStr.replace("3", "짝");
			numStr = numStr.replace("6", "짝");
			numStr = numStr.replace("9", "짝");
			System.out.println(numList.get(i) + " : " + numStr);
		}
	}
}
