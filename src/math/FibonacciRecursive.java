package math;

public class FibonacciRecursive {

	public static int fibonacci(int n) {
		if (n < 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			System.out.println(fibonacci(i));
		}
	}
}
