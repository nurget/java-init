package p06;

public class NullTest {

	String str1 = "123";
	String str2;
	
	public static void main(String[] args) {
		NullTest nt = new NullTest();
		System.out.println(nt.str2); // null , null에는 length, toString이 없기 때문에 사용하면 Null Pointer Exception 발생
	}
}
