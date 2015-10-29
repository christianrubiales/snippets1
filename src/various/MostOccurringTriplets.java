package various;

import java.util.*;

public class MostOccurringTriplets {
	
	private static String[][] logFile = new String[][]{
		{"/", "user_1"}, {"/about", "user_1"}, {"/", "user_3"}, {"/features", "user_1"}, {"/about", "user_2"}, 
		{"/purchase", "user_2"}, {"/purchase", "user_1"},{"/thank-you", "user_1"}, {"/about", "user_3"}, 
		{"/thank-you", "user_2"}, {"/purchase", "user_3"}, {"/thank-you", "user_3"}
	};
	
	public static void main(String[] args) {
		// create the user visits mapping from user to list of visited sites
		Map<String, List<String>> userVisits = new HashMap<String, List<String>>();
		for (String[] visit : logFile) {
			List<String> visits = userVisits.get(visit[1]);
			if (visits == null) {
				visits = new ArrayList<String>();
				userVisits.put(visit[1], visits);
			}
			visits.add(visit[0]);
		}
		
		// build triplet counts
		Map<Triplet, Integer> counts = new HashMap<Triplet, Integer>();
		for (String user : userVisits.keySet()) {
			List<String> visits = userVisits.get(user);
			Triplet triplet;
			for (int i = 0; i < visits.size() - 2; i++) {
				triplet = new Triplet(visits.get(i), visits.get(i+1), visits.get(i+2));
				if (counts.containsKey(triplet)) {
					counts.put(triplet, counts.get(triplet) + 1);
				} else {
					counts.put(triplet, 1);
				}
			}
		}
		
		// get most frequent by inverting the mapping and using a TreeMap
		SortedMap<Integer, List<Triplet>> frequencies = new TreeMap<Integer, List<Triplet>>(Collections.reverseOrder());
		for (Triplet triplet : counts.keySet()) {
			Integer count = counts.get(triplet);
			List<Triplet> triplets = frequencies.get(count);
			if (triplets == null) {
				triplets = new ArrayList<Triplet>();
				frequencies.put(count, triplets);
			}
			triplets.add(triplet);
		}
		
		System.out.println(frequencies);
		
		// get 10 most occurring
		int counter = 0;
		List<Triplet> mostFrequent = new ArrayList<Triplet>();
		for (Integer count : frequencies.keySet()) {
			boolean full = false;
			for (Triplet triplet : frequencies.get(count)) {
				if (counter < 10) {
					mostFrequent.add(triplet);
				} else {
					break;
				}
			}
			if (full) {
				break;
			}
		}
		
		System.out.println(mostFrequent);
	}
	
	private static final class Triplet {
		String first;
		String second;
		String third;
		
		Triplet(String first, String second, String third) {
			this.first = first;
			this.second = second;
			this.third = third;
		}
		
		public int hashCode() {
			return first.hashCode() + second.hashCode() + third.hashCode();
		}
		
		public boolean equals(Object obj) {
			return first.equals(((Triplet) obj).first) 
					&& second.equals(((Triplet) obj).second)
					&& third.equals(((Triplet) obj).third);
		}
		
		public String toString() {
			return "(\"" + first + "\", \"" + second + "\", \"" + third + "\")";
		}
	}
}