package p03;

public class TwoDismensionalArray {

	public static void main(String[] args) {
		int[][] numsArray = new int[3][3];
		System.out.println(numsArray.length); // numsArray는 int [][] numsArray 0의 갯수는 3
		// 출력값 3

		for (int i = 0; i < numsArray.length; i++) {
//			System.out.println(numsArray[i].length); // 출력값 3 3 3
			for (int j = 0; j < numsArray[i].length; j++) {
				numsArray[i][j] = 1;
			}
		}

		for (int i = 0; i < numsArray.length; i++) {
			for (int j = 0; j < numsArray[i].length; j++) {
				System.out.println(numsArray[i][j]);
			}
		}
	}
}
