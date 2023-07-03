package p06;

public class AnimalExec {
	
	public static void printAnimal(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			if (!animal.name.equals("깜순이")) { // 부정연산자 사용해서 냥이만 출력되지 않도록
				animal.hunt();
			} if ("새".equals(animal.type)) {
				animal.fly();
			}
			animal.eat();
			animal.run();
		}
	}

	public static void main(String[] args) {	
		Animal tiger = new Animal();
		tiger.name = "호걸이";
		tiger.type = "호랑이";
		
		Animal cat = new Animal();
		cat.name = "깜순이";
		cat.type = "고양이";
		
		Animal bird = new Animal();
		bird.name = "새희";
		bird.type = "새";
		
		Animal[] animals = new Animal[3];
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = bird;
		
		printAnimal(animals);
		
//		Animal tiger = new Animal();
//		tiger.name = "호돌이";
//		tiger.eat();
//		tiger.run();
//		tiger.hunt();
//		
//		Animal cat = new Animal();
//		cat.name = "냥이";
//		cat.eat();
//		cat.run();
//		cat.hunt();
	}
}
