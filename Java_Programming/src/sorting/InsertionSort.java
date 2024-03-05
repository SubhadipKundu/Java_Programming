package sorting;

import getdata.ArrayInteger;

public class InsertionSort {
	
	private int[] arr = new ArrayInteger().getArr();
	private int length = arr.length;
	
	public void executeInsertionSort() {
		
		if (length == 0 ) {
			System.out.println("Array size is 0. No elements to sort.");
			return;
		}
		
		for (int i = 1; i < length; i ++) {
			
			int j = i - 1;
			int current = arr[i];
			
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j --;
			}
			
			arr[j + 1] = current;
			
		}
		
		new PrintSortedArray().executePrintSortedArray(arr);
		
	}
	
}
