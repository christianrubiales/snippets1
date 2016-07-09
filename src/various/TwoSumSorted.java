package various;

import java.util.HashMap;
import java.util.Map;

/**
 * O(n)
 */
public class TwoSumSorted {

	public static Map<Integer, Integer> twoSum(int[] array, int sum) {
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		int i = 0, j = array.length - 1;
		
		while (i < j) {
			if (array[i] + array[j] == sum) {
				pairs.put(array[i], array[j]);
				i++;
				j--;
			} else if (array[i] + array[j] < sum) {
				i++;
			} else {
				j--;
			}
		}
		
		return pairs;
	}
	
	public static void main(String[] args) {
		System.out.println(twoSum(new int[]{0,1,2,3,4,5,6,7,8,9,10}, 5));
	}

}
