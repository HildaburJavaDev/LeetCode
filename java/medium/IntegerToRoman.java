package medium;

import java.util.HashMap;
import java.util.Map;

// task № 12 // NO SOLUTION

public class IntegerToRoman {
	public static void main(String[] args) {

	}

	public static String intToRoman(int num) {
		Map<Integer, Character> numbers = new HashMap<>();
		initMap(numbers);
		String answeString = ""; // 1509
		return answeString;
	}

	public static void initMap(Map<Integer, Character> numbers) {
		numbers.put(1, 'I');
		numbers.put(5, 'V');
		numbers.put(10, 'X');
		numbers.put(50, 'L');
		numbers.put(100, 'C');
		numbers.put(500, 'D');
		numbers.put(1000, 'M');
	}
}
