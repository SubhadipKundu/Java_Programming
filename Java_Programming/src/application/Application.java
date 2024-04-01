package application;

import java.util.Random;

import generatedata.ArrayInteger;
import searching.FibanocciSearch;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new FibanocciSearch().executeFibanocciSearch(new ArrayInteger().getArr(), new Random().nextInt(100)));
		
	}

}
