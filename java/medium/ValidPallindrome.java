package medium;

// task № 125

// not optimal
public class ValidPallindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("0P"));
	}

	public static boolean isPalindrome(String s) {
		String cleanedString = s.replaceAll("[^\\p{IsAlphabetic}\\p{Digit}]", "").toLowerCase();
		return cleanedString.equals(new StringBuilder(cleanedString).reverse().toString());
	}
}
