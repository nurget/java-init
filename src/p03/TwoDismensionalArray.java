package p03;

public class TwoDismensionalArray {

	public static void main(String[] args) {
		int[][] numsArray = new int[3][3];
		System.out.println(numsArray.length); // numsArray는 int [][] numsArray 0의 갯수는 3
//		(2) int cnt = 1;
		// 출력값 3
							// 3
		for (int i = 0; i < numsArray.length; i++) {
								// 3
			for (int j = 0; j < numsArray[i].length; j++) {
				numsArray[i][j] = (3*i+j) +1;
//				(2) numsArray[i][j] = cnt++; // ++보다 대입이 먼저 됨.
			}
		}

		for (int i = 0; i < numsArray.length; i++) {
			for (int j = 0; j < numsArray[i].length; j++) {
				System.out.println(numsArray[i][j]);
			}
		}
	}
}
