package various;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * O(n) time, O(log n) space (only for the bitset, not including the space for the return values)
 */
public class TwoSumUnsortedBitSet {

	public static Map<Integer, Integer> twoSum(int[] array, int sum) {
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		BitSet bitset = new BitSet();
		
		for (int i : array) {
			bitset.set(i);
		}
		
		int next = -1;
		for (int i = 0; i < bitset.cardinality() / 2; i++) {
			next = bitset.nextSetBit(next + 1);
			
			if (sum - next > 0 && bitset.get(sum - next)) {
				pairs.put(next, sum - next);
			}
		}
		
		return pairs;
	}
	
	public static void main(String[] args) {
		System.out.println(twoSum(new int[]{6,7,4,1}, 5));
		System.out.println(twoSum(new int[]{6,7,5,0}, 5));
		System.out.println(twoSum(new int[]{3,2,4,5,1,6,7,8,4,10,0}, 5));
	}

}
