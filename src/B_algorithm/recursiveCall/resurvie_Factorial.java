package B_algorithm.recursiveCall;

public class resurvie_Factorial {
	public static void main(String[] args) {
		int result = factorial(10);
		System.out.println(result);
	}

	/**
	 * factorial(5) == 5*4*3*2*1;
	 * @param num
	 * @return
	 */
	public static int factorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num * factorial(num -1);
	}
}
