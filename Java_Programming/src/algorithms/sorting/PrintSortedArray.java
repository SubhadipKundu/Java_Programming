package algorithms.sorting;

public class PrintSortedArray {
	
	public void executePrintSortedArray(int[] arr) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("Sorted Array : [");
		
		for (int i : arr) {
			stringBuilder.append(i);
			stringBuilder.append(", ");
		}
		
		stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
		stringBuilder.append(']');
		
		System.out.println(stringBuilder);
		
	}
	
}
