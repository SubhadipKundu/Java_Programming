package application;

import java.util.Random;

import generatedata.ArrayInteger;
import searching.BinarySearch;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr;
		
		do {
			arr = new ArrayInteger().getArr();
		} while(arr.length == 0);
		
		System.out.println(new BinarySearch().executeBinarySearch(arr, new Random().nextInt(100)));
		
	}

}
