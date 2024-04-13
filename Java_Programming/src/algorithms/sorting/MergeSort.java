package algorithms.sorting;

public class MergeSort {

	public int[] executeMergeSort(int[] arr) {
		
		sort(arr, 0, arr.length - 1);
		
		return arr; 
		
	}
	
	private void sort(int[] arr, int start, int end) {
		
		if (start < end) {
			
			int mid = (start + end) / 2;
			
			sort(arr, start, mid);
			sort(arr, mid + 1, end);
			
			merge(arr, start, mid, end);
		}
		
	}

	private void merge(int[] arr, int start, int mid, int end) {
		
		int left = mid - start + 1;
		int right = end - mid;
		
		int[] leftArray = new int[left];
		int[] rightArray = new int[right];
		
		for (int i = 0; i < left; i ++) {
			leftArray[i] = arr[start + i];
		}
		
		for (int j = 0; j < right; j ++) {
			rightArray[j] = arr[mid + 1 + j];
		}
		
		int l = 0;
		int r = 0;
		int k = start;
		
		while (l < left && r < right) {
			
			if (leftArray[l] < rightArray[r]) {
				arr[k] = leftArray[l];
				l ++;
			} else {
				arr[k] = rightArray[r];
				r ++;
			}
			
			k ++;
			
		}
		
		while (l < left) {
			arr[k] = leftArray[l];
			k ++;
			l ++;
		}
		
		while (r < right) {
			arr[k] = rightArray[r];
			k ++;
			r ++;
		}
		
	}
	
}
