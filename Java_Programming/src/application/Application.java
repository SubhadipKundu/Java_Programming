package application;

import java.util.Random;

import generatedata.ArrayInteger;
import searching.BinarySearch;
import searching.JumpSearch;
import searching.LinearSearch;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr;
		
		do {
			arr = new ArrayInteger().getArr();
		} while(arr.length == 0);
		
		System.out.println(new JumpSearch().executeJumpSearch(arr, new Random().nextInt(100)));
		
	}

}
