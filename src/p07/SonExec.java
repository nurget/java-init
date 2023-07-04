package p07;

class Song {
	public int rank;
	public String title;
	public void printTitle() {
		System.out.println("노래 제목: " + title);
	}
	
	public static void printSomething() {
//		System.out.println("노래 제목: " + title); // title에서 에러, static에는 static 밖에 사용 불가.
	}
}

public class SonExec {

	public static void main(String[] args) {
		Son s = new Son();
//		Father f = new Son();
//		Object o = new Son();
		
		s.name = "새희";
		s.job = "개발자";
		s.age = 30;
		s.hobby = "플라잉요가";
		s.printJob();
		s.printHobby();
		
		Father f = new Father();
		f.name = "새희 아버지";
		
		Son s2 = (Son)f;
		s2.hobby = "투자";
		System.out.println(s2.name);
		
		Song song = new Song();
		song.title = "윌리엄이 부르는 Let It Go";
		song.printTitle();
	}
}
