package various;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * O(n log n) due to sorting, if already sorted then just O(n)
 */
public class TwoSumUnsorted {

	public static Map<Integer, Integer> twoSum(int[] array, int sum) {
		Arrays.sort(array);
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
		System.out.println(twoSum(new int[]{3,2,4,5,1,6,7,8,4,10,0}, 5));
	}

}
