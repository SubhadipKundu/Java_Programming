//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//
//Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//
//Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
//Return k.
//Custom Judge:
//
//The judge will test your solution with the following code:
//
//int[] nums = [...]; // Input array
//int[] expectedNums = [...]; // The expected answer with correct length
//
//int k = removeDuplicates(nums); // Calls your implementation
//
//assert k == expectedNums.length;
//for (int i = 0; i < k; i++) {
//    assert nums[i] == expectedNums[i];
//}
//If all assertions pass, then your solution will be accepted.

package challenges;

import algorithms.sorting.PrintSortedArray;
import generatedata.ArrayInteger;

public class RemoveDuplicates {
	
	int[] arr = new ArrayInteger().getArr();
//	int[] arr = {0,0,0,1,1,1,1,2,2,3,3,4};
	int length = arr.length;
	
	public void executeRemoveDuplicates() {
		
		if (length == 0) {
			System.out.println("The array is empty.");
			return;
		}
		
		int k = 0;
		
		for (int i = 1; i < length; i++) {
			
			if (arr[i] != arr[k]) {
				k ++;
				arr[k] = arr[i];
			}
			
		}
		
		System.out.println(k + 1);
		
		new PrintSortedArray().executePrintSortedArray(arr);
		
	}
	
}
