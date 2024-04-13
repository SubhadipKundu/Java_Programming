package algorithms.searching;

public class FibanocciSearch {
	
	public int executeFibanocciSearch(int[] arr, int target) {
		
		System.out.println("Target Element : " + target);
		System.out.println();
		
		int length = arr.length;
		int i = 0;
		int j = 1;
		int k = i + j;
		
		while (k < length) {
			if (target < arr[k])
				break;
			else if (target > arr[k]) {
				i = j;
				j = k;
				k = i + j;
			} else
				return k;
		}
		
		for (int n = j; n < length; n ++)
			if (target == arr[n])
				return n;
		
		return -1;
		
	}
	
}
