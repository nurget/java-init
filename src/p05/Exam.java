package p05;

public class Exam {

	public static int getFoodPriceSum(int p1, int p2, int p3, int p4, int p5) {
		return p1+p2+p3+p4+p5;
	}
	public static void main(String[] args) {
		String foodName = "삼겹살";
		int foodPrice = 15000;
		String foodType = "한식";
		
		String foodName1 = "치킨";
		int foodPrice1 = 25000;
		String foodType1 = "한식";
		
		String foodName2 = "짜장면";
		int foodPrice2 = 7000;
		String foodType2 = "중식";
		
		String foodName3 = "마라탕";
		int foodPrice3 = 15000;
		String foodType3 = "중식";
		
		String foodName4 = "돈까스";
		int foodPrice4 = 10000;
		String foodType4 = "일식";
		
		int priceSum = getFoodPriceSum(foodPrice, foodPrice1, foodPrice2, foodPrice3, foodPrice4);
		int[] foodsPrice = new int[] {foodPrice, foodPrice1, foodPrice2, foodPrice3, foodPrice4};
	}
	
	public static int getFoodPriceSum(int[] foodsPrice) {
		int sum = 0; 
		for(int i = 0; i < foodsPrice.length; i++) {
			sum += foodsPrice[i];
		}
		return sum;
	}
}
