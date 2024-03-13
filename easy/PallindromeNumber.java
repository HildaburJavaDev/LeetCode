/*
 Runtime - beats 100%
 */

import java.util.Scanner;

public class PallindromeNumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			System.out.println(isPalindrome(new Scanner(System.in).nextInt()));
		} catch (NumberFormatException ex) {
			System.out.println("Проверьте ввод на соответствие integer. " + ex.getMessage());
		}

	}

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int temp = x;
		int reversed = 0;
		for (int i = 1; temp != 0; i *= 10) {
			reversed = (reversed * 10) + temp % 10;
			temp /= 10;
		}
		return (reversed == x);
	}
}
