package p02;

public class ArrayTest {
	public static void main(String[] args) {
		String[] strs; // 변수의 선언
		String[] strs2 = new String[2]; // 변수의 선언과 초기화
		// String은 모든 참조형에 null로 초기화, int는 0
		System.out.println(strs2[0]);
		System.out.println(strs2[1]);
//		strs2 = "1"; 이건 안되고
		strs2[0] = "1"; // 이건 됨
		strs2[1] = "2";
		
		System.out.println(strs2[0].length()); // 1
//		System.out.println(strs2[1].length()); // strs2[1] = "2"로 선언 안했을 때 에러 발생
		
//		String str0 = "1";
//		String str1 = "2";
		
		String[] strNums = new String[10];
		// 0 -> 1 
		// 1 -> 2
		// 2 -> 3
		// 9 -> 10
		
		for (int i = 0; i < 10; i++) {
			strNums[i] = i+1+"";
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(strNums[i]);
		}
	}
} 
