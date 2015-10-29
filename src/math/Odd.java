package math;

public class Odd {

	public static boolean isOdd(int n) {
		return (n & 1) != 0;
	}
	
	public static void main(String[] args) {
		System.out.println(isOdd(-2));
		System.out.println(isOdd(-1));
		System.out.println(isOdd(0));
		System.out.println(isOdd(1));
		System.out.println(isOdd(2));
		System.out.println(isOdd(3));
	}

}
