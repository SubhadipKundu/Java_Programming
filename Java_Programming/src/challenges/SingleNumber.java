/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 */

package challenges;

public class SingleNumber {
	
	public int executeSingleNumber(int[] arr) {
		
		int result = 0;
		for (int i : arr)
			result ^= i;
		
		return result;
		
	}
	
}
