package p03;

public class ThreeSixNine {

	public static void main(String[] args) {

		/*
		 * 1부터 100까지 3, 6, 9에 짝
		 * 5의 배수일 때는 만세 
		 */
		for (int i = 1; i <= 100; i++) {
			int num = i % 10;
			int num2 = i / 10;
			
			if ((num != 0 && num % 3 == 0) || (num2 != 0 && num2 % 3 == 0)) {
				System.out.println("짝, ");	
			} else if(i % 5 == 0) {
				System.out.println("만세, ");
			} else {
				System.out.println(i);
			}

		}
	}
}
