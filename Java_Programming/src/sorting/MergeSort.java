package sorting;

import getdata.ArrayInteger;

public class MergeSort {
	
	private int arr[] = new ArrayInteger().getArr();
	private int length = arr.length;
	
	public void executeMergeSort() {
		
		if (length == 0 ) {
			System.out.println("Array size is 0. No elements to sort.");
			return;
		}
		
		System.out.println();
		
		sort(0, length - 1);
		
		new PrintSortedArray().executePrintSortedArray(arr);
		
		System.out.println();
		
	}
	
	private void sort(int start, int end) {
		
		if (start < end) {
			
			int mid = (start + end) / 2;
			
			sort(start, mid);
			sort(mid + 1, end);
			
			merge(start, mid, end);
		}
		
	}

	private void merge(int start, int mid, int end) {
		
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
