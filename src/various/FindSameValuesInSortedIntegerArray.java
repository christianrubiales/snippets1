package various;

import java.util.ArrayList;
import java.util.List;

public class FindSameValuesInSortedIntegerArray {

	public static List<Integer> getSameValues(int[] arr1, int[] arr2) {
		List<Integer> same = new ArrayList<Integer>();
		int i = 0, j = 0;
		
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				same.add(arr1[i]);
				i++;
				j++;
			} else {
				if (arr1[i] < arr2[j]) {
					i++;
				} else {
					j++;
				}
			}
		}
		
		return same;
	}
	
	public static void main(String[] args) {
		System.out.println(getSameValues(new int[]{1,2,3,4,5}, new int[]{3,4,5,6,7,8})); // 3, 4, 5
		System.out.println(getSameValues(new int[]{1,2,4,5,6,7,8}, new int[]{2,3,6,9,10})); // 2, 6
	}

}
