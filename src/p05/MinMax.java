package p05;

public class MinMax {

	public static void main(String[] args) {
		int[] nums = new int[] {-1, -12, -3, -4, 5};
		
		int max = nums[0];
		int maxIdx = 0;
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
				maxIdx = i;
			}
		}
		
		int min = nums[0];
		int minIdx = 0;
		for (int i = 1; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
				minIdx = i;
			}
		}
		
		System.out.println("최대값: " + max + ", index: " + maxIdx + "번째");
		System.out.println("최소값: " + min + ", index: " + minIdx + "번째");
	}
}
