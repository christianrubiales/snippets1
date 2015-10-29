package math;

import java.util.HashSet;
import java.util.Set;

public class OddNumberOfTimesUsingSet {

	public static Object getOdd(Object[] items) {
		Set<Object> set = new HashSet<Object>();
		
		for (Object object : items) {
			if (set.contains(object)) {
				set.remove(object);
			} else {
				set.add(object);
			}
		}
		
		return set.iterator().next();
	}
	
	public static void main(String[] args) {
		System.out.println(getOdd(new Integer[]{2})); //2
		System.out.println(getOdd(new Integer[]{1,2,1})); //2
		System.out.println(getOdd(new Integer[]{3,1,3,2,1})); //2
		System.out.println(getOdd(new Integer[]{3,1,3,2,3,1,3})); //2
	}

}
