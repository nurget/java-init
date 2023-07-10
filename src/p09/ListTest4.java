package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest4 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 3개를 ,를 기준으로 입력해주세요 : "); //2,7,5
		String numStr = scan.nextLine();
		/*
		 * numStr을 ,를 기준으로 배열을 만드신 후
		 * numList에 추가해주세요.
		 */
		String[] strs = numStr.split(",");
		for(int i=0;i<strs.length;i++) {
			int num = Integer.parseInt(strs[i]);
			numList.add(num);
		}

		System.out.print("숫자 3개를 ,를 기준으로 입력해주세요 : "); // 1,3,5
		numStr = scan.nextLine();
		strs = numStr.split(",");
		/*
		 * numStr을 ,를 기준으로 배열을 만드신 후
		 * numList에 맞는게 몇개나 있는 출력해주세요.
		 */
		int cnt = 0;
		for(int i=0;i<strs.length;i++) {
			int num = Integer.parseInt(strs[i]);
//			for(int j=0;j<numList.size();j++) {
//				if(num==numList.get(j)) {
//					cnt++;
//				}
//			}
			if(numList.indexOf(num)!=-1) {
				cnt++;
			}
		}
		System.out.println("맞춘 갯수 : " + cnt);
	}
}
