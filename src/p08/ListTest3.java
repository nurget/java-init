package p08;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>(); // 1.7 이상은 표준어가 아님
		ArrayList<String> strList1 = new ArrayList<>(); // 생략해도 가능
		
		/*
		 * Collection Framework
		 * List, Map, Set : Interface
		 */
		List<String> strList2; // List는 인터페이스 , 메모리 생성이 안됨.
//		List<String> strList3 = new List<>(); 이건 에러
		List<String> strList3 = new ArrayList<>(); // ArrayList를 List라고 부를 수 있음 / 사이즈 0개
		strList3.add("안녕"); // 0층 안녕
		System.out.println(strList3.get(0)); // 0층 출력: 안녕
		strList3.remove(0); // 철거
		System.out.println(strList3.get(0)); // 없는 층 출력: 에러
	}
}
