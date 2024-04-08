import java.util.Scanner;

public class LengthOfLastWord {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(new Scanner(System.in).nextLine()));
	}

	public static int lengthOfLastWord(String s) {
		String[] words = s.split(" ");
		return words[words.length - 1].length();
	}
}
