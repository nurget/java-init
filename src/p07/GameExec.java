package p07;

public class GameExec {

	public static void runGame(Game game) {
		game.start();
		game.playing();
		game.stop();
	}
	
	public static void main(String[] args) {
		Game valorant = new Valorant();
		valorant.name = "발로란트";
		valorant.price = 0;
		valorant.genre = "FPS";
		Game minecraft = new Minecraft();
		minecraft.name = "마인크래프트";
		minecraft.price = 9900;
		minecraft.genre = "생존게임";
		
		Game[] games = new Game[2];
		games[0] = valorant;
		games[1] = minecraft;
		
		for (int i = 0; i < games.length; i++) {
			runGame(valorant);
			runGame(minecraft);
			System.out.print(games[i].name + "는 " + games[i].price + "원입니다. 장르는 " + games[i].genre + "입니다. ");
			if (games[i] instanceof Valorant) {
				Valorant vr = (Valorant)games[i];
				vr.playType = "PC";
				System.out.println("플레이 방식은 " + vr.playType + "입니다.");
			} else if (games[i] instanceof Minecraft) {
				Minecraft mc = (Minecraft)games[i];
				mc.playType = "PC&모바일";
				System.out.println(mc.playType + "입니다.");
			} else {
				System.out.println();
			}
		}
		
	}
}
