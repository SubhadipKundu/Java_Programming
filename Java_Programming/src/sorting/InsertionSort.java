package sorting;

public class InsertionSort {
	
	public int[] executeInsertionSort(int[] arr) {
		
		int length = arr.length;
		
		for (int i = 1; i < length; i ++) {
			
			int j = i - 1;
			int current = arr[i];
			
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j --;
			}
			
			arr[j + 1] = current;
			
		}
		
		return arr;
		
	}
	
}
