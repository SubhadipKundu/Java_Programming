package searching;

import sorting.MergeSort;

public class BinarySearch {
	
	
	public int executeBinarySearch(int[] arr, int target) {
		
		return search(new MergeSort().executeMergeSort(arr), 0, arr.length - 1, target);
		
	}
	
	private int search(int[] arr, int start, int end, int target) {
		
		if (start > end)
			return -1;
		
		int mid = (start + end) / 2;
		
		if (arr[mid] == target)
			return mid;
		
		if (target < arr[mid])
			return search(arr, start, mid - 1, target);
		else
			return search(arr, mid + 1, end, target);
		
	}
	
}
