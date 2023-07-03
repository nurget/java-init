package p06;

public class ConvertStringToInt {

	public static void main(String[] args) {
		String str = "1";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		String[] strs = {"2","4","5"};
		int[] nums = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			nums[i] = Integer.parseInt(strs[i]);;
			
		}
	}
}
