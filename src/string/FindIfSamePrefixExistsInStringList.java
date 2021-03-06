package string;

import java.util.Arrays;
import java.util.List;

public class FindIfSamePrefixExistsInStringList {

	public static boolean exists(List<String> list) {
		char c = list.get(0).charAt(0);
		
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).charAt(0) != c) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(exists(Arrays.asList(new String[]{"a", "ab"}))); // true
		System.out.println(exists(Arrays.asList(new String[]{"submarine", "subarray"}))); // true
		System.out.println(exists(Arrays.asList(new String[]{"ab", "bc"}))); // false
		System.out.println(exists(Arrays.asList(new String[]{"a", "ab", "abc"}))); // true
	}

}
