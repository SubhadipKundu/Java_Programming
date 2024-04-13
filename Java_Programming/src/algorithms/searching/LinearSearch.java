package algorithms.searching;

import algorithms.sorting.MergeSort;

public class LinearSearch {
	
	public int executeLinearSearch(int[] arr, int target) {
		
		int length = arr.length;
		
		arr = new MergeSort().executeMergeSort(arr);
		
		for (int i = 0; i < length; i ++)
			if (target == arr[i])
				return i;
		
		return -1;
		
	}
	
}
