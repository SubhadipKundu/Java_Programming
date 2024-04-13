package algorithms.sorting;

public class InsertionSort {
	
	public int[] executeInsertionSort(int[] arr) {
		
		int length = arr.length;
		
		for (int i = 1; i < length; i ++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j --;
			}
			
			arr[j + 1] = temp;
			
		}
		
		return arr;
		
	}
	
}
