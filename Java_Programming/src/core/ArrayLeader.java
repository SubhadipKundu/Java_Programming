package core;

import getdata.ArrayInteger;

public class ArrayLeader {
	
	private int[] arr = new ArrayInteger().getArr();
	private int length = arr.length;
	
	public void executeArrayLeader() {
		
		if (length == 0) {
			System.out.println("The array is empty. Unable to proceed.");
			return;
		}
		
		System.out.println();
		
	}
	
}
