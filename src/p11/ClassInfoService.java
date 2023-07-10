package p11;

import java.util.List;
import java.util.Map;

public class ClassInfoService {

	public List<Map<String,String>> getClassInfos(Map<String,String> param) {
		ClassInfoRepository ciRepo = new ClassInfoRepository();
		return ciRepo.getClassInfos(param);
		
	}
	
	public int insertClassInfo(Map<String,String> classInfo) {
		ClassInfoRepository ciRepo = new ClassInfoRepository();
		return ciRepo.insertClassInfo(classInfo);
	}
	
	public int deleteClassInfo(Map<String,String> classInfo) {
		ClassInfoRepository ciRepo = new ClassInfoRepository();
		return ciRepo.deleteClassInfo(classInfo);
	}
}
