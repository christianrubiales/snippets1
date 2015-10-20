package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * We can just use the first characters of each word and put them in a set.
 */
public class FindIfSamePrefixExistsInStringList {

	public static boolean exists(List<String> list) {
		Set<Character> set = new HashSet<Character>();
		
		for (String s : list) {
			if (set.contains(s.charAt(0))) {
				return true;
			}
			set.add(s.charAt(0));
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(exists(Arrays.asList(new String[]{"a", "ab"}))); // true
		System.out.println(exists(Arrays.asList(new String[]{"submarine", "subarray"}))); // true
		System.out.println(exists(Arrays.asList(new String[]{"ab", "bc"}))); // false
	}

}
