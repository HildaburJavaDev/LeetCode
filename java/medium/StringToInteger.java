package medium;

// task №8

public class StringToInteger {
	public static void main(String[] args) {
		System.out.println(myAtoi("2147483648"));
	}

	public static int myAtoi(String s) {
		long result = 0, factor = 1;
		s = s.trim();
		boolean wasSign = false, needSign = true;
		for (char ch : s.toCharArray()) {
			if ((ch == '-' || ch == '+') && (needSign)) {
				if (wasSign) {
					return 0;
				}
				if (ch == '-')
					factor = -1;
				if (ch == '+') {
					factor = 1;
				}
				wasSign = true;
				continue;
			} else if (Character.isDigit(ch)) {
				int digit = ch - '0';
				if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
					return factor > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
				}
				result = result * 10 + digit;
				needSign = false;
			} else {
				return (int) (result * factor);
			}
		}
		return (int) (result * factor);
	}
}
