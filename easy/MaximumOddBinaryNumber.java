/*
 Runtime - beats 72.21%
 Memory - beats 74.40%
 */

import java.util.Scanner;

class MaximumOddBinaryNumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println(maximumOddBinaryNumber(new Scanner(System.in).nextLine()));
	}

	public static String maximumOddBinaryNumber(String s) {
		int length = s.length(), start = 0, end = length - 2;
		boolean isExistOne = false;
		char[] str = new char[length];
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == '1') {
				if (!isExistOne) {
					str[length - 1] = s.charAt(i);
					isExistOne = true;
				} else {
					str[start++] = s.charAt(i);
				}
			} else {
				str[end--] = s.charAt(i);
			}
		}
		return new String(str);
	}
}
