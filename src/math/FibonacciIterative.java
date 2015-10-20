package math;

public class FibonacciIterative {

	public static int fibonacci(int n) {
		if (n < 2) {
			return 1;
		} else {
			int prev = 1, prev2 = 1, fib = 0;
			for (int i = 2; i <= n; i++) {
				fib = prev + prev2;
				prev2 = prev;
				prev = fib;
			}
			return fib;
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			System.out.println(fibonacci(i));
		}
	}
}
