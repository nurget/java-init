package p01;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
//		int i = r.nextInt(10) + 1; // 소문자에 괄호 o, 메서드임
//		System.out.println(i);
//		r.nextInt(10)은 0~9까지 출력, 출력값을 1~10으로 바꾸고 싶기 때문에 +1을 해줌.
		
		int[] nums = new int[3];
		for(int i=0; i<3; i++) {
			nums[i] = r.nextInt(10) + 1;
		}
		for(int i=0; i<3; i++) {
			System.out.println(nums);
		}
		
		nums[0] = r.nextInt(10)+1;
		System.out.println(nums[0]);
		nums[1] = r.nextInt(10)+1;
		System.out.println(nums[1]);
		nums[2] = r.nextInt(10)+1;
		System.out.println(nums[2]);
	
	}
}
