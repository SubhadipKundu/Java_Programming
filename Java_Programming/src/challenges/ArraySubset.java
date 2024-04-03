package challenges;

import java.util.HashMap;
import java.util.Map;

import generatedata.ArrayInteger;

public class ArraySubset {
	
	public void executeArraySubset() {
		
		int[] a1 = new ArrayInteger().getA1();
		int[] a2 = new ArrayInteger().getA2();
		
		int l1 = a1.length;
		int l2 = a2.length;
		
		if (l1 == 0 || l2 == 0) {
			System.out.println("One fo gthe array is empty. Unable to proceed.");
			return;
		}
		
		if (l1 < l2) {
			System.out.print("Is Array[" + l1 + "] a subset of Array[" + l2 + "]? ");
			System.out.println(isSubset(a1, a2));
		} else {
			System.out.print("Is Array[" + l2 + "] a subset of Array[" + l1 + "]? ");
			System.out.println(isSubset(a2, a1));
		}
		
	}
	
	private String isSubset(int[] arrShort, int[] arrLong) {
		
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
