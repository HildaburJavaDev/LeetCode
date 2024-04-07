package medium;

public class ValidParenthesisString {
	public static void main(String[] args) {
		System.out.println(checkValidString(
				"(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
	}

	public static boolean checkValidString(String s) {
		int scopes = 0;
		int stars = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '(')
				scopes++;
			else if (ch == ')')
				scopes--;
			else
				stars++;
		}
		System.out.println(scopes + " " + stars);
		if (scopes == 0)
			return true;
		if (scopes < 0 && scopes + stars >= 0)
			return true;
		if (scopes > 0 && scopes - stars <= 0)
			return true;
		return false;
	}
}
