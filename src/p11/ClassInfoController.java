package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassInfoController {
	public List<Map<String,String>> getClassInfos(Map<String,String> param){
		ClassInfoService ciService = new ClassInfoService();
		return ciService.getClassInfos(param);
	}
	
	public int insertClassInfo(Map<String,String> classInfo) {
		return 0;
	}
	
	public int deleteClassInfo(Map<String,String> classInfo) {
		return 0;
	}
	
	public static void main(String[] args) {
		ClassInfoController ciController = new ClassInfoController();
		Map<String,String> param = new HashMap<>(); 
		List<Map<String,String>> classInfoList = ciController.getClassInfos(param);
		System.out.println("번호\t이름\t설명\t");
		for (Map<String,String> classInfo : classInfoList) {
			System.out.println(classInfo.get("ciNum") + "\t" + classInfo.get("ciName") + "\t" + classInfo.get("ciDesc") + "\t");

		}
		
		param.put("ciName", "김도영");
		param.put("ciDesc", "타자");
		int result = ciController.insertClassInfo(param);
		System.out.println("실행결과: " + param);
		
//		param.put("ciNum", "6");
//		int result = ciController.deleteClassInfo(param);
//		System.out.println("실행 결과: " + result);
	}
}
