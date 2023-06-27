package p01;

public class StringTest2 {
	public static void main(String []args) {
		String str = "20001126";
		char c = str.charAt(7);
		System.out.println(c);
		
		String name = "TISSUE";
		name = name.toLowerCase();
		System.out.println(name);
		
		String s1 = "1";
		System.out.println(s1);
		String s2 = new String("1");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
