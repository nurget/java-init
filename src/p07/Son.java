package p07;

/*
 * 1. Son, 2. Father, 3. Object
 * 
 * Son s = new Son();
 * Father f = new Son();
 * Object o = new Son();
 * 
 */

public class Son extends Father {
	public String hobby;
	
	public void printHobby() { // static 넣으면 name, hobby에서 에러
		System.out.println(name +"님의 취미는 " + hobby +"입니다.");
	}
}
