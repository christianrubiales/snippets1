package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class LargestNumbersFromStream {

	public static List<Integer> getLargest(List<Integer> list, int k) {
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		for (Integer i : list) {
			if (heap.size() == k) {
				if (heap.peek() < i) {
					heap.poll();
					heap.offer(i);
				}
			} else {
				heap.offer(i);
			}
		}
		
		List<Integer> largest = new ArrayList<Integer>();
		for (Integer i : heap) {
			largest.add(i);
		}
		
		return largest;
	}
	
	public static void main(String[] args) {
		System.out.println(getLargest(Arrays.asList(new Integer[]{3,4,2,5,1}), 3));
		System.out.println(getLargest(Arrays.asList(new Integer[]{312312,312,31234323,4234,53,4242}), 3));
		System.out.println(getLargest(Arrays.asList(new Integer[]{5,4,3,2,1}), 3));
		System.out.println(getLargest(Arrays.asList(new Integer[]{1,1,1,1,2}), 3));
	}

}
