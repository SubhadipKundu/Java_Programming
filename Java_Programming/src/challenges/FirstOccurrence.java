//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

package challenges;

import java.util.Scanner;

public class FirstOccurrence {
	
	String haystack;
	String needle;
	
	public void executeFirstOccurrence() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Haystack : ");
		haystack = scanner.nextLine();
		System.out.println();
		System.out.println("Needle : ");
		needle = scanner.nextLine();
		System.out.println();
		
		scanner.close();
		
		int haystacklength = haystack.length();
		int needleLength = needle.length();
		
		if (needle.equals(haystack)) {
			System.out.println("The first occurrence of '" + needle + "' is at 0");
			return;
		}
		
		if (haystacklength < needleLength) {
			System.out.println(needle + " not found in " + haystack);
			return;
		}
		
		int i = 0;
		while (i < (haystacklength - needleLength) + 1) {
			if (needle.equals(haystack.substring(i, i + needleLength))) {
				
				System.out.println(i);
				return;
			}
			i ++;
		}
		
		System.out.println(needle + " not found in " + haystack);
		
	}
	
}
