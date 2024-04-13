package algorithms.sorting;

public class SelectionSort {
	
	public int[] executeSelectionSort(int[] arr) {
		
		int length = arr.length;
		
		for (int i = 0; i < length - 1; i++) {
			int minimum = i;
			for (int j = i + 1; j < length; j ++) {
				if (arr[j] < arr[minimum]) {
					minimum = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
		}
		
		return arr;
		
	}
	
}