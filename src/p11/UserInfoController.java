package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoController {

	public List<Map<String,String>> getUserInfoList(Map<String,String> param) {
		UserInfoService uiService = new UserInfoService();
		return uiService.getUserInfoList(param);
	}  
	public int insertUserInfo(Map<String,String> userInfo) {
		UserInfoService uiService = new UserInfoService();
		return uiService.insertUserInfo(userInfo);
	}
	
	public int deleteUserInfo(Map<String,String> userInfo) {
		return 0;
	}
	
	public static void main(String[] args) {
		UserInfoController uiController = new UserInfoController();
		Map<String,String> param = new HashMap<>(); 
//		param.put("uiName", "벤틀리는컴포즈걸");
//		param.put("uiId", "벤틀리"); 얘네를 안넣으면 테이블 모두가 출력되고 하나라도 있으면 해당하는 것만 나옴.
		List<Map<String,String>> userInfoList = uiController.getUserInfoList(param);
		System.out.println("번호\t이름\t아이디\t비밀번호\t");
		for (Map<String,String> userInfo : userInfoList) {
			System.out.println(userInfo.get("uiNum") + "\t" + userInfo.get("uiName") + "\t" + userInfo.get("uiId") + "\t" + userInfo.get("uiPwd") + "\t");
		}
		
//		param.put("uiName", "철수");
//		param.put("uiId", "cs");
//		param.put("uiPwd", "1111");
//		int result = uiController.insertUserInfo(param);
//		System.out.println("실행결과: " + result);
		
		param.put("uiNum", "6");
		int result = uiController.deleteUserInfo(param);
		System.out.println("실행 결과: " + result);
	}
}
