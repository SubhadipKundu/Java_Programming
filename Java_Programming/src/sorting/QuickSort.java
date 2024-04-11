package sorting;

public class QuickSort {
	
	public int[] executeQuickSort(int[] arr) {
		
		return sort(arr, 0, arr.length - 1);
		
	}
	
	private int[] sort(int[] arr, int start, int end) {
		
		if (end <= start)
			return arr;
		
		int pivot = partition(arr, start, end);
		sort(arr, start, pivot - 1);
		sort(arr, pivot + 1, end);
		
		return arr;
		
	}
	
	private int partition(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int i = start - 1;
		for (int j = start; j < end; j ++) {
			if (arr[j] < pivot) {
				i ++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i ++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		
		return i;
		
	}
	
}
