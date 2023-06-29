package p04;

public class Cafe {

	public static String getCoffee(String order, int price) {
		int aa = 79000;
		if (aa > price) {
			int noMoney = aa - price;
			return "윌리엄님. 돈이 모자릅니다. 돈을 " + noMoney + "원 더 내시던지 나가세요.";
		} else if (aa < price) {
			int yesMoney = price - aa;
			return "안녕하세요. 윌리엄님 주문하신 " + aa + "원 짜리 " + order + "가 준비되었습니다. " + "잔돈은 " + yesMoney + "원입니다. 근데 제가 가질게요.";
		}
		return order;
	}

	public static void main(String[] args) {
		String coffee = getCoffee("자몽에이드에 휘핑크림 추가", 80000);
		System.out.println(coffee);
		coffee = getCoffee("자몽에이드에 휘핑크림 추가", 30000);
		System.out.println(coffee);
		coffee = getCoffee("자몽에이드에 휘핑크림 추가", 120000);
		System.out.println(coffee);

	}
}
