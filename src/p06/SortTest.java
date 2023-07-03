package p06;

public class SortTest {
	// select sort 
	public static void main(String[] args) {
		int[] nums = new int[] {10,7,15,1,4};
		System.out.println("정렬 전!");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		// 0 - 4
		for (int i = 0; i < nums.length; i++) {
			int min = nums[i];
			int idx = i;
			for (int j = i +1; j < nums.length; j++) {
				if (min > nums[j]) {
					min = nums[j];
					idx = j;
				}
			}
			System.out.println();
			
			int temp = nums[idx];
			nums[idx] = nums[i];
			nums[i] = temp;
			
			for (int elem : nums) {
				System.out.println(elem + " ");
			}
		}
	}
}
