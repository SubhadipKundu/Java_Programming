package sorting;

import getdata.ArrayInteger;

public class BubbleSort {
	
	private int[] arr = new ArrayInteger().getArr();
	private int length = arr.length;
	
	public void executeBubbleSort() {
		
		if (length == 0 ) {
			System.out.println("Array size is 0. No elements to sort.");
			return;
		}
		
		for (int i = 0; i < length - 1; i ++)
			for (int j = 0; j < length - 1; j ++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		
		new PrintSortedArray().executePrintSortedArray(arr);
		
	}
	
}
