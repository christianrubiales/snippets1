package various;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * Also for very large arrays
 */
public class FindSameValuesInUnsortedIntegerArrayBitSet {

	public static List<Integer> getSameValues(int[] arr1, int[] arr2) {
		List<Integer> same = new ArrayList<Integer>();
		BitSet set1 = new BitSet();
		BitSet set2 = new BitSet();
		
		for (int i : arr1) {
			set1.set(i);
		}
		for (int i : arr2) {
			set2.set(i);
		}
		
		set1.and(set2);
		
		for (int i = set1.nextSetBit(0); i != -1; i = set1.nextSetBit(i + 1)) {
			same.add(i);
		}
				
		return same;
	}
	
	public static void main(String[] args) {
		System.out.println(getSameValues(new int[]{2,4,3,5,1}, new int[]{5,4,7,8,3})); // 3, 4, 5
		System.out.println(getSameValues(new int[]{8,5,6,2,4,7,1}, new int[]{9,10,6,2,3})); // 2, 6
	}
}
