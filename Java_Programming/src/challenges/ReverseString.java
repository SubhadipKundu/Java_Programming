package challenges;

public class ReverseString {
	
	public String executeReverseString(String str) {
		
		int length  = str.length();
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = length - 1; i >= 0; i --) {
			stringBuilder.append(str.charAt(i));
		}
		
		return stringBuilder.toString();
		
	}
	
}
