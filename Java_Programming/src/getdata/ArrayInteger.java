package getdata;

import java.util.Random;

public class ArrayInteger {
	
	private Random random = new Random();
	
	private int[] a1;
	private int[] a2;
	private int[] arr;
	
	public ArrayInteger() {
		
		a1 = new int[random.nextInt(25)];
		a2 = new int[random.nextInt(25)];
		arr = new int[random.nextInt(25)];
		
		setA1();
		setA2();
		setArr();
		
	}

	public int[] getA1() {
		printArray(a1);
		System.out.println();
		return a1;
	}

	public void setA1() {
		this.a1 = populateArray(a1.length);
	}

	public int[] getA2() {
		printArray(a2);
		System.out.println();
		return a2;
	}

	public void setA2() {
		this.a2 = populateArray(a2.length);
	}

	public int[] getArr() {
		printArray(arr);
		System.out.println();
		return arr;
	}

	public void setArr() {
		this.arr = populateArray(arr.length);
	}
	
	private int[] populateArray(int length) {
		
		int[] a = new int[length];
		
		for(int i = 0; i < length; i ++) {
			a[i] = random.nextInt(99);
		}
		
		return a;
		
	}
	
	private void printArray(int[] arr) {
		
		int length = arr.length;
		
		if (length == 0) {
			System.out.println("Array is Empty");
			return;
		}
		
		System.out.println("Array of size : " + length);
		System.out.print("Elements of Array : ");
		System.out.print("[");
		
		for (int i = 0; i < length - 1; i ++) {
			System.out.print(arr[i] + ", ");
			
		}
		
		System.out.print(arr[length - 1] + "]");
		System.out.println();
		
	}
	
}
