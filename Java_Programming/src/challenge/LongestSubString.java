//To find the longest sub-string without repeating character

package challenge;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	
	private String str = "Hello World";
	int length = str.length();
	
	public void executeLongestSubString() {
		
		int start = 0;
		int maxLength = 0;
		
		Set<Character> characters = new HashSet<>();
		
		for (int i = 0; i < length; i ++) {
			char ch = str.charAt(i);
			while (characters.contains(ch)) {
				characters.remove(str.charAt(start));
				start ++;
			}
			characters.add(ch);
			maxLength = Math.max(maxLength, i - start + 1);
		}
		
		System.out.println(maxLength);
		
	}
	
}
