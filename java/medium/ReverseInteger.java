package medium;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(-2147483648));
	}

	public static int reverse(int x) {
		int factor = 1;
		if (x < 0) {
			x *= -1;
			factor = -1;
		}
		long answer = 0;
		;
		for (; x != 0; x /= 10) {
			answer = answer * 10 + (x % 10);
			if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
				return 0;
			}
		}
		return (int) answer * factor;
	}
}
