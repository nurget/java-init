package p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("age", 33);
		map.put("age", 2);
		map.put("like", 7);
		map.put("rank", 11);
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
	}
}
