package p10;

public class SQLTest {

	public static void main(String[] args) {
		String sql = "SELECT * FROM USER_INFO";
		sql +="WHERE UI_ID = 'TEST1'";
		System.out.println(sql);
	}
}
