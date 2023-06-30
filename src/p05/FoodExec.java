package p05;

public class FoodExec {

	public static void printFood(Food[] foods) {
		for(Food f : foods) {
			System.out.println("음식: " + f.name);
			System.out.println("가격: " + f.price + "원");
			System.out.println("식사류: " + f.type);	
		}
	}
	
	public static void main(String[] args) {
		Food f1 = new Food(); // 참조형 데이터타입 / 변수 f
		f1.name = "삼겹살";
		f1.price = 15000;
		f1.type = "한식";
		
		Food f2 = new Food();
		f2.name = "닭갈비";
		f2.price = 12000;
		f2.type = "한식";
		
		Food f3 = new Food();
		f3.name = "윌리엄이 좋아하는 졸리비치밥";
		f3.price = 2000;
		f3.type = "필리핀식";
		
		Food f4 = new Food();
		f4.name = "김치찌개";
		f4.price = 8000;
		f4.type = "한식";
		
		Food f5 = new Food();
		f5.name = "라멘";
		f5.price = 10000;
		f5.type = "일식";
		
		Food[] foods = new Food[5]; // 2차원 배열 Food의 이름, Food의 가격, Food의 식사류 
		foods[0] = f1;
		foods[1] = f2;
		foods[2] = f3;
		foods[3] = f4;
		foods[4] = f5;
		
		printFood(foods);
	}
}
