package sorting;

import getdata.ArrayInteger;

public class SelectionSort {
	
	private ArrayInteger arrayInteger = new ArrayInteger();
	
	private int[] arr = arrayInteger.getArr();
	private int length = arr.length;
	
	public void executeSelectionSort() {
		
		for (int i = 0; i < length - 1; i++) {
			int minimum = i;
			for (int j = i + 1; j < length; j ++) {
				if (arr[j] < arr[minimum]) {
					minimum = j;
				}
			}
			
			if (minimum != i) {
				int temp = arr[i];
				arr[i] = arr[minimum];
				arr[minimum] = temp;
			}
		}
		
		new PrintSortedArray().executePrintSortedArray(arr);
		
	}
	
}
