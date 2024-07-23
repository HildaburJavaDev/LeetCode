package medium;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// task №3

public class LongestSubstringWithoutRepeatingCharacters {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring(new Scanner(System.in).nextLine()));
	}

	public static int lengthOfLongestSubstring(String s) {
		int answer = 0, left = 0, right = 0;
		Set<Character> set = new HashSet<>();

		while (right < s.length()) {
			char symbol = s.charAt(right);

			if (!set.contains(symbol)) {
				set.add(symbol);
				right++;
				answer = Math.max(answer, right - left);
			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}

		return answer;
	}
}
