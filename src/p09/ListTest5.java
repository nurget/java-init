package p09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest5 {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(1);
		numList.add(35);
		numList.add(17);
		numList.add(4);
		Collections.sort(numList);
		System.out.println(numList);
		
	}
}
