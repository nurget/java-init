package p10;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatch {

	public static void main(String[] args) {

		try {
			Integer.parseInt("일");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
