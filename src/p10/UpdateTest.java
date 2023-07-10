package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd", "root", "kd1824java");
			Statement stmt = con.createStatement();
			String sql = "UPDATE USER_INFO SET UI_NAME='동동이2', UI_PWD='하하' WHERE UI_NUM = 6";
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("반영된 행 갯수 : " +resultCnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
