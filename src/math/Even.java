package math;

public class Even {

	public static boolean isEven(int n) {
		return (n & 1) == 0;
	}
	
	public static void main(String[] args) {
		System.out.println(isEven(-2));
		System.out.println(isEven(-1));
		System.out.println(isEven(0));
		System.out.println(isEven(1));
		System.out.println(isEven(2));
		System.out.println(isEven(3));
	}

}
