import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		output(calculate(input()));
	}

	private static void output(int calculate) {
		System.out.println(calculate);
	}

	private static int calculate(String data) {
		int sum = 0;
		Map<Character, Integer> map = new HashMap<>();
		int[] numbers = new int[data.length()];
		addStaticMap(map);
		addArrayOfNumbers(map, numbers, data);
		for (int i = 0; i < numbers.length; i++) {
			if (i != numbers.length - 1) {
				if (numbers[i] < numbers[i + 1])
					sum -= numbers[i];
				else
					sum += numbers[i];
			} else {
				sum += numbers[i];
			}
		}
		return sum;
	}

	private static void addArrayOfNumbers(Map<Character, Integer> map, int[] array, String data) {
		for (int i = 0; i < data.length(); i++) {
			array[i] = map.get(data.charAt(i));
		}
	}

	private static void addStaticMap(Map<Character, Integer> map) {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}

	@SuppressWarnings("resource")
	private static String input() {
		System.out.println("Enter the roman numbers:");
		return new Scanner(System.in).nextLine();
	}
}