//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

package challenge;

import java.util.Random;

import getdata.ArrayInteger;

public class SearchInsertPosition {
	
	int[] arr = new ArrayInteger().getArr();
	int length = arr.length;
	
	int target  = new Random().nextInt(100);
	
	public void executeSearchInsertPosition() {
		
		System.out.println("Target element : " + target);
		System.out.println();
		
		if (length == 0 ) {
			System.out.println("The target value would be at index 1.");
			return;
		}
		
		int start = 0;
		int end = length - 1;
		
		while (start <= end) {
			
			int mid = start + (end - start) / 2;
			
			if (arr[mid] == target) {
				System.out.println("The target element is at index " + mid);
				return;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			
		}
		
		System.out.println("The target value would be at index " + start);
		
	}
	
}
