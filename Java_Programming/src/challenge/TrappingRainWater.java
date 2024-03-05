package challenge;

import getdata.ArrayInteger;

public class TrappingRainWater {
	
	private int[] arr = new ArrayInteger().getArr();
	private int length = arr.length;
	
	public void executeTrappingRainWater() {
		
		if (length == 0 ) {
			System.out.println("Array size is 0. No elements to sort.");
			return;
		}
		
		findTrappedWater();
		
	}
	
	private void findTrappedWater() {
		
		int wallLeft = 0;
		int wallRight = 0;
		
		int sum = 0;
		
		int[] maxLeft = new int[length];
		int[] maxRight = new int[length];
		
		for (int i = 0; i < length; i ++) {
			maxLeft[i] = wallLeft;
			wallLeft = getMax(wallLeft, arr[i]);
		}
		for (int i = length - 1; i >= 0; i --) {
			maxRight[i] = wallRight;
			wallRight = getMax(wallRight, arr[i]);
		}
		
		for (int i = 0; i < length; i ++) {
			sum += getMax(0, getMin(maxLeft[i], maxRight[i]) - arr[i]);
		}
		
		System.out.println(sum);
		
	}
	
	private int getMax(int a, int b) {
		
		if (a > b) {
			return a;
		} else {
			return b;
		}
		
	}
	
	private int getMin(int a, int b) {
		
		if (a < b) {
			return a;
		} else {
			return b;
		}
		
	}
	
}
