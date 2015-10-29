package math;


public class OddNumberOfTimesUsingXor {

	public static int getOdd(int[] items) {
		int x = items[0];
		
		for (int i = 1; i < items.length; i++) {
			x ^= items[i];
		}
		
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(getOdd(new int[]{2})); //2
		System.out.println(getOdd(new int[]{1,2,1})); //2
		System.out.println(getOdd(new int[]{3,1,3,2,1})); //2
		System.out.println(getOdd(new int[]{3,1,3,2,3,1,3})); //2
	}

}
