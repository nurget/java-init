package p08;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		String str1 = "안녕, ";
		String str2 = "내 소개를 ";
		String str3 = "하지. ";
		String str4 = "내 직업은 ";
		String str5 = "기아타이거즈 감독이야.";
		
		String[] strs = new String[5];
		
		strs[0] = str1;
		strs[1] = str2;
		strs[2] = str3;
		strs[3] = str4;
		strs[4] = str5;
		
		System.out.println(strs);
		
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]);
		}
		// <>안에 기본형은 들어갈 수 없음
		// ex) ArrayList<int> intList; 불가능
		ArrayList<String> strList = new ArrayList<String>(); // String만 저장할 수 있는 ArrayList / ArrayList 스트링으로 통일
		System.out.println(strList.size());
		strList.add("1");
		System.out.println(strList.size());
		strList.add("a");
		System.out.println(strList.size());
		strList.add("2");
		System.out.println(strList.size());
		strList.add("가");
		System.out.println(strList.size());
		strList.remove(0);
		System.out.println(strList.size());
		
		strList.add(str1);
		strList.add(str2);
		strList.add(str3);
		strList.add(str4);
		strList.add(str5);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
	}
}
