import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// task №1

public class TwoSum {
	public static void main(String[] args) {
		try {
			List<String> input = input();
			int target = Integer.parseInt(input.get(1));
			int numbers[] = extractArraysFromSubString(input.get(0).split("[,;\s]"));
			System.out.println(Arrays.toString(twoSum(numbers, target)));
		} catch (NumberFormatException ex) {
			System.out.println("Проверьте ввод на соответствие integer. " + ex.getMessage());
		}

	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		return new int[] {};
	}

	public static int[] extractArraysFromSubString(String[] subStringNumbers) {
		int[] nums = new int[subStringNumbers.length];
		for (int i = 0; i < subStringNumbers.length; i++) {
			nums[i] = Integer.parseInt(subStringNumbers[i]);
		}
		return nums;
	}

	public static List<String> input() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("Введите массив чисел");
		list.add(scanner.nextLine());
		System.out.println("Введите target:");
		list.add(scanner.nextLine());
		return list;
	}
}
