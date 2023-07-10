package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Join {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String uiId = scan.nextLine();
		System.out.print("PASSWORD : ");
		String uiPwd = scan.nextLine();
		System.out.print("NAME : ");
		String uiName = scan.nextLine();
		
		String sql = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME) ";
		sql += " VALUES('" + uiId + "' ,'" + uiPwd + "','" + uiName + "')";
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			int resultCnt = stmt.executeUpdate(sql);
			if(resultCnt==1) {
				System.out.println(uiName + "님 회원가입이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
