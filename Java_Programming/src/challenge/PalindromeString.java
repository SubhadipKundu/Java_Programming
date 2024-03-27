package challenge;

public class PalindromeString {
	
	public boolean executePalindromeString(String str) {
		
		int length = str.length();
		
		if (length == 0 || length == 1)
			return true;
		
		if (length == 2)
			if (str.charAt(0) == str.charAt(1))
				return true;
			else
				return false;
		
		int mid = length - (length / 2);
		
		int left = mid - 1;
		int right = mid + 1;
		
		while (left > 0) {
			if (str.charAt(left - 1) != str.charAt(right - 1))
				return false;
			else {
				left --;
				right ++;
			}
		}
		
		return true;
		
	}
	
}
