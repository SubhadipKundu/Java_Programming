package sorting;

public class PrintSortedArray {
	
	public void executePrintSortedArray(int[] arr) {
		
		int length = arr.length;
		
		System.out.print("Sorted Array : ");
		System.out.print("[");
		
		for (int i = 0; i < length - 1; i ++) {
			System.out.print(arr[i] + ", ");
			
		}
		
		System.out.print(arr[length - 1] + "]");
		System.out.println();
		
	}
	
}
