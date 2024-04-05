package challenges;

import java.util.HashMap;
import java.util.Map;

import generatedata.ArrayInteger;

public class ArraySubset {
	
	public String executeArraySubset(int[] a1, int[] a2) {
		
		int l1 = a1.length;
		int l2 = a2.length;
		
		int[] arrShort;
		int[] arrLong;
		
		if (l1 == 0 || l2 == 0)
			return "No";
		
		if (l1 < l2) {
			arrShort = a1;
			arrLong = a2;
		} else {
			arrShort = a2;
			arrLong = a1;
		}
		
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for (int num : arrLong)
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		
		for (int num : arrShort) {
			if (!countMap.containsKey(num) || countMap.get(num) == 0) {
				return "No";
			}
			countMap.put(num, countMap.get(num) - 1);
		}
		
		return "Yes";
		
	}
	
}
