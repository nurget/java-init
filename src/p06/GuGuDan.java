package p06;

public class GuGuDan {
	
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(j + "X" + i + " = " + (i*j)); 
				// i j 순서면 1X1, 1X2 .. 가 되고
				// j i 순서면 1X1, 2X1 .. 가 된다.
				if(j==9) {
					System.out.println();
				} else {
					System.out.print(", ");
				}
			}
		}
	}
}
