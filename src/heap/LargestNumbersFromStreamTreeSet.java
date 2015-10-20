package heap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Set will only work if there are no duplicates.
 */
public class LargestNumbersFromStreamTreeSet {

	public static Collection<Integer> getLargest(List<Integer> list, int k) {
		SortedSet<Integer> set = new TreeSet<Integer>();
		
		for (Integer i : list) {
			if (set.size() == k) {
				if (set.first() < i) {
					set.remove(set.first());
					set.add(i);
				}
			} else {
				set.add(i);
			}
		}
		
		return set;
	}
	
	public static void main(String[] args) {
		System.out.println(getLargest(Arrays.asList(new Integer[]{3,4,2,5,1}), 3));
		System.out.println(getLargest(Arrays.asList(new Integer[]{312312,312,31234323,4234,53,4242}), 3));
		System.out.println(getLargest(Arrays.asList(new Integer[]{5,4,3,2,1}), 3));
		System.out.println(getLargest(Arrays.asList(new Integer[]{1,1,1,1,2}), 3));
	}

}
