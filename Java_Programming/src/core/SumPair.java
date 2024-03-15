package core;

import java.util.HashSet;
import java.util.Random;

import generatedata.ArrayInteger;

public class SumPair {
	
private Random random = new Random();
	
	private int arr[] = new ArrayInteger().getArr();
	private int length = arr.length;
	private int x = random.nextInt(25);
	
	public void executeSumPair() {
		
		if (length == 0 ) {
			if (x == 0)
				System.out.println("Result : True");
			else
				System.out.println("Result : False");
			return;
		}
		
		System.out.println("Sum Element : " + x);
		System.out.println();
		
		System.out.print("Result : ");
		if (sumPairPresent())
			System.out.println("True");
		else
			System.out.println("False");
		
		System.out.println();
		
	}
	
	private boolean sumPairPresent() {
		
		HashSet<Integer> setCompliment = new HashSet<>();
		
		int compliment;
		
		for (int i : arr) {
			compliment = x - i;
			if (setCompliment.contains(compliment)) {
				return true;
			}
			setCompliment.add(i);
		}
		return false;
		
	}
	
}
