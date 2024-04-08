package medium;

import java.util.Scanner;

public class ReverseInteger {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println(reverse(new Scanner(System.in).nextInt()));
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
