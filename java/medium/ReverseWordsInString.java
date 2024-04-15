package medium;

// not optimal

public class ReverseWordsInString {
	public static void main(String[] args) {
		System.out.println(reverseWords("  hello, . !World  "));
	}

	public static String reverseWords(String s) {
		String cleanedString = s.replaceAll("[\\s\\p{P}]", "").toLowerCase();
		return cleanedString;
	}
}
