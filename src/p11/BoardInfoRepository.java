package p11;
// UPDATE와 DELETE는 WHERE가 필수

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.sql.Statement;

import p10.DBCon;

public class BoardInfoRepository {

	public List<Map<String,String>> getBoardInfoList() {
		List<Map<String,String>> list = new ArrayList<>();
		Connection con = DBCon.getCon();
		try {
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM BOARD_INFO";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			Map<String,String> map = new HashMap<>();
			map.put("biNum", rs.getString("BI_NUM"));
			map.put("biTitle", rs.getString("BI_TITLE"));
			map.put("biContent", rs.getString("BI_CONTENT"));
			map.put("biWriter", rs.getString("BI_WRITER"));
			map.put("biCredat", rs.getString("BI_CREDAT"));
			map.put("biCnt", rs.getString("BI_CNT"));
			list.add(map);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;		
	}
	
	public int updataBoardInfo (Map<String,String> boardInfo) {
		Connection con = DBCon.getCon();
		
		try {
			Statement stmt = con.createStatement();
			String sql = "UPDATE BOARD_INFO SET ";
			if (boardInfo.get("biTitle") != null) {
				sql += " BI_TITLE='" + boardInfo.get("biTitle") + "',";
			}
			if (boardInfo.get("biContent") != null) {
				sql += " BI_CONTENT='" + boardInfo.get("biConent") + "',";
			}
			if (boardInfo.get("biWriter") != null) {
				sql += " BI_WRITER='" + boardInfo.get("biWriter") + "',";
			}
			if (boardInfo.get("biCnt") != null) {
				sql += " BI_CNT='" + boardInfo.get("biCnt") + "',";
			}
			sql = sql.substring(0, sql.length()-1);
			sql += "WHERE BI_NUM=" + boardInfo.get("biNum");
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		BoardInfoRepository biRepo = new BoardInfoRepository();
		List<Map<String,String>> boardInfoList = biRepo.getBoardInfoList();
		for (Map<String,String> boardInfo : boardInfoList) {
			System.out.println(boardInfo);
		}
		Map<String,String> boardInfo = new HashMap<>();
		boardInfo.put("biNum", "1");
		boardInfo.put("biCnt", "1");
		int result = biRepo.updataBoardInfo(boardInfo);
		System.out.println("업데이트 결과: " + result); // 업데이트 결과가 1이 나와야 정상
	}
	
	public int insertBoardInfo(Map<String,String> boardInfo) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO BOARD_INFO(BI_TITLE, BI_CONTENT, BI_WRITER, BI_CREDAT, BI_CNT)";
			sql += "values('" + boardInfo.get("biTitle") + "','" + boardInfo.get("biContent") + "',";
			sql += " '" + boardInfo.get("biWriter") + "' " + boardInfo.get("biWriter") + "')";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteBoardInfo(Map<String,String> boardInfo) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = (Statement) con.createStatement();
			String sql = "DELETE FROM BOARD_INFO WHERE BI_NUM=" + boardInfo.get("biNum");
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
