package p06;

public class HumanExec {

	public static void main(String[] args) {
		/*
		 * 5명의 사람을 만들기
		 * 각각의 이름과 나이를 다르게 입력하세요.
		 * 길이 5개리 Human 배열을 만듭니다.
		 * 반복문을 사용하여 최고령, 최연소가 누구인지 출력하면 됩니다.
		 * 
		 * 평균을 구한 뒤 평균이랑 제일 근접한 나이가 누구인지 출력하면 됩니다.
		 */
		
		Human[] humans = new Human[5];
		
		humans[0] = new Human();
		humans[0].name = "벨";
		humans[0].age = 45;
		
		humans[1] = new Human();
		humans[1].name = "윌리엄";
		humans[1].age = 38;
		
		humans[2] = new Human();
		humans[2].name = "벤틀리";
		humans[2].age = 29;
		
		humans[3] = new Human();
		humans[3].name = "오로라";
		humans[3].age = 22;
		
		humans[4] = new Human();
		humans[4].name = "자스민";
		humans[4].age = 18;
		
		Human fAge = humans[0];
		Human lAge = humans[0];
		
		int sum = 0;
		
		for (int i = 0; i < humans.length; i++) {
			if (humans[i].age > fAge.age) {
				fAge = humans[i];
			}
		}
		System.out.println("할머니: " + fAge.name + "(" + fAge.age + ")");
		
		for (int i = 0; i < humans.length; i++) {
			if (humans[i].age < lAge.age) {
				lAge = humans[i];
			}
		}
		System.out.println("아기: " + lAge.name + "(" + lAge.age + ")");
		
		for (int i = 0; i < humans.length; i++) {
			sum += humans[i].age;
		}

		int avg = sum/humans.length;
		System.out.println("나이 평균: " + avg);	
		String names = "";
		
		// Math.abs() 절대값을 이용해 문제 풀어보기
		int findAge = Math.abs(humans[0].age - avg); // 가장 가까운 나이 차이 초기화
		String names1 = "";
		
		for (int i = 0; i < humans.length; i++) {
			int find = Math.abs(humans[i].age - avg); // 나이와 평균 차이 계산
			
			if (find < findAge) {
				findAge = find; // 더 작은 차이로 바꾸기
				names1 = humans[i].name; // 이름 초기화
			}
		}
		System.out.println("나이 평균과 가장 가까운 사람은 " + names1 + "님 입니다.");
	}

}
