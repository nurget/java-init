package p05;

public class HumanExec {
		
	/*
	 * 5명이 가진 총액
	 * 5명의 평균액
	 */

	public static void main(String[] args) {
		Human[] humans = new Human[5];
		
		humans[0] = new Human();
		humans[0].name = "윌리엄";
		humans[0].money = 20000;
		
		humans[1] = new Human();
		humans[1].name = "벤틀리";
		humans[1].money = 15000;
		
		humans[2] = new Human();
		humans[2].name = "벨";
		humans[2].money = 30000;
		
		humans[3] = new Human();
		humans[3].name = "오로라";
		humans[3].money = 10000;
		
		humans[4] = new Human();
		humans[4].name = "자스민";
		humans[4].money = 10000;
		
		int sum = 0;
		
		for (int i = 0; i < humans.length; i++) {
			sum += humans[i].money;
		}
		
		System.out.println("총액: " + sum);
		int avg = sum/humans.length;
		System.out.println("평균: " + (sum / humans.length));	
		String names = "";
		
		for (int i = 0; i < humans.length; i++) {
			if (avg <= humans[i].money) {
				names += humans[i].name + "님, ";
			}
		}
		names = names.substring(0, names.length()-2);
		System.out.println(names + "은 부자입니다. 나머지는 쿠팡 뛰러 가세요.");
	}	
}
