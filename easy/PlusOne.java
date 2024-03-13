/*
 Runtime - beats 100%
 Memory - beats 82%
 */

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] { 9, 9 })));

	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
}
