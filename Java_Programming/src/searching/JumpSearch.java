package searching;

import sorting.MergeSort;

public class JumpSearch {
	
	public int executeJumpSearch(int[] arr, int target) {
		
		arr = new MergeSort().executeMergeSort(arr);
		
		int length = arr.length;
		int step = (int) Math.floor(Math.sqrt(length));
		int previous = 0;
		
		while (arr[Math.min(step, length) - 1] < target) {
			previous = step;
			step += step;
			if (previous >= length)
				return -1;
		}
		
		while (arr[previous] < target) {
			previous ++;
			if (previous == Math.min(step, length))
				return -1;
		}
		
		if (arr[previous] == target)
			return previous;
		
		return -1;
		
	}
	
}
