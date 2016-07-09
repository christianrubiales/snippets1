package various;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * O((n/2) (log n))
 */
public class TwoSumAlreadySortedBinarySearch {

	public static Map<Integer, Integer> twoSum(int[] array, int sum) {
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		
		for (int i = 0; i <= array.length / 2; i++) {
			int index = Arrays.binarySearch(array, sum - array[i]);
			if (index > -1 && index != i) {
				int min = array[i]; 
				int max = array[index];
				if (min > max) {
					min = array[index];
					max = array[i];
				}
				pairs.put(min, max);
			}
		}
		
		
		return pairs;
	}
	
	public static void main(String[] args) {
		System.out.println(twoSum(new int[]{0,1,2,3,4,5,6,7,8,9,10}, 5));
	}

}
