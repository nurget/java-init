package p01;

public class StringCondition {
	public static void main(String[] args) {
		String s1 = "123";
		if(s1 == "123") {
			System.out.println("s1은 123");
		} else {
			System.out.println("s1은 123이 아님");
		}
		
		String s2 = new String("123");
		if(s2 == "123") {
			System.out.println("s2는 123");
		} else {
			System.out.println("s2는 123이 아님");
		}
		
		String s3 = "";
		System.out.println(s3.equals(" ")); // false
		
		String s4 = "	123 "; //	123 
		System.out.println("	123 ".trim()); //123
		System.out.println(s4.trim().equals("123")); //true
		
		String s5 = new String("1");
		System.out.println("1".equals(s5));
		System.out.println(s5.equals("1")); // 이 방법은 지양함. 윗 줄과 결과 값은 true로 같음
		
		String s6 = null;
		System.out.println("1".equals(s6)); // false, 이 방법으로 습관을 들여야 함.
//		System.out.println(s6.equals("1")); // error, null은 아예 값이 없는데 값을 비교하려고 하니 에러가 남.
	}
}
