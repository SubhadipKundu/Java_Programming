package challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import generatedata.ArrayInteger;

public class DuplicateElements {
	
	private int[] arr = new ArrayInteger().getArr();
	private int length = arr.length;
	
	public void executeDuplicateElements() {
		
		if (length == 0) {
			System.out.println("The array is empty. Duplicate search not possible.");
			return;
		}
		
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for (int num : arr) {
			if (countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num) + 1);
			} else {
				countMap.put(num, 1);
			}
		}
		
		System.out.print("Duplicate elements in the array : ");
		System.out.println(findDuplicates(countMap));
		
	}
	
	private List<Integer> findDuplicates(Map<Integer, Integer> countMap) {
		
		List<Integer> duplicateList = new ArrayList<>();
		
		for (int num : countMap.keySet()) {
			if (countMap.get(num) > 1) {
				duplicateList.add(num);
			}
		}
		
		if (duplicateList.size() == 0) {
			duplicateList.add(-1);
		}
		
		return duplicateList;
		
	}
	

	
}
