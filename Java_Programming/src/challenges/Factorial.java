package challenges;

public class Factorial {
	
	public int executeFactorial(int n) {
		
		if (n == 0)
			return 1;
		
		return n * executeFactorial(n - 1);
		
	}
	
}
