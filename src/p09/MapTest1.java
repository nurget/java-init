package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Test{
	public String toString() {
		return "응 난 Test라고 해";
	}
}
public class MapTest1 {

	public static void main(String[] args) {
		
		Map<String,String> m = new HashMap<>();
		m.put("name", "김홍균");
		m.put("age", "25");
		m.put("address", "서울");
		
		Map<String,String> m1 = new HashMap<>();
		m1.put("name", "김진수");
		m1.put("age", "27");
		m1.put("address", "서울");
		
		Map<String,String> m2 = new HashMap<>();
		m2.put("name", "김아영");
		m2.put("age", "24");
		m2.put("address", "부산");
		
		Map<String,String> m3 = new HashMap<>();
		m3.put("name", "이왕균");
		m3.put("age", "25");
		m3.put("address", "광주");
		List<Map<String,String>> mapList = new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		
		for(Map<String,String> map : mapList) {
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.print(key + " : " + map.get(key) + ",");
			}
			System.out.println();
		}
	}
	
	
	
}
