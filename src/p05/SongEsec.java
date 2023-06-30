package p05;

public class SongEsec {

	public static void printSongs(Song[] songs) {
		for (Song s : songs) {
			System.out.println("노래: " + s.name);
			System.out.println("가수: " + s.singer);
			System.out.println("순위: " + s.rank);
		}
	}

	public static void main(String[] args) {
		Song[] songs = new Song[5];
		
		songs[0] = new Song();
		songs[0].name = "윌리엄, 벤틀리, 그리고 푸른 수염의 샘";
		songs[0].singer = "윌벤져스";
		songs[0].rank = 4;
		
		songs[1] = new Song();
		songs[1].name = "OMC(오 마이 철재)";
		songs[1].singer = "윌진스";
		songs[1].rank = 27;
		
		songs[2] = new Song();
		songs[2].name = "QueenCard";
		songs[2].singer = "(세희)아이들";
		songs[2].rank = 33;
		
		songs[3] = new Song();
		songs[3].name= "세희맘바";
		songs[3].singer = "벤틀리";
		songs[3].rank = 69;
		
		songs[4] = new Song();
		songs[4].name = "불장난";
		songs[4].singer = "윌리엄";
		songs[4].rank = 95;

//		printSongs(songs);		

		Song firstSong = songs[0];
		for (int i = 1; i < songs.length; i++) {
			if (songs[i].rank < firstSong.rank) {
				firstSong = songs[i];
			}
		}
		System.out.println("1위: " + firstSong.name + " - " + firstSong.singer);
		
		Song lastSong = songs[0];
		for (int i = 1; i < songs.length; i++) {
			if (songs[i].rank > lastSong.rank) {
				lastSong = songs[i];
			}
		}
		System.out.println("5위: " + lastSong.name + " - " + lastSong.singer);		
	}
}

//int minRank = songs[0].rank;
//int minIdx = 0;
//int maxRank = songs[0].rank;
//int maxIdx = 0;
//for(int i = 1; i < songs.length; i++) {
//	if(minRank > songs[i].rank) {
//		minRank = songs[i].rank;
//		minIdx = i;
//	}
//	if(maxRank > songs[i].rank) {
//		maxRank = songs[i].rank;
//		maxIdx = i;
//	}
//}
//
//System.out.println("일등: " + songs[minIdx].singer);
