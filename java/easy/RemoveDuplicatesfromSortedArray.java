/*
 Runtime - beats 75.32%
 */

import java.util.Scanner;

public class RemoveDuplicatesfromSortedArray {
	public static void main(String[] args) {
		String input = input();
		int[] nums = extractArraysFromSubString(input.split("[,;\s]"));
		output(nums, removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		int result = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[result++] = nums[i];
			}
		}
		return result;
	}

	public static int[] extractArraysFromSubString(String[] subStringNumbers) {
		int[] nums = new int[subStringNumbers.length];
		for (int i = 0; i < subStringNumbers.length; i++) {
			nums[i] = Integer.parseInt(subStringNumbers[i]);
		}
		return nums;
	}

	public static void output(int[] nums, int result) {
		for (int i = 0; i < result; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	@SuppressWarnings("resource")
	public static String input() {
		return new Scanner(System.in).nextLine();
	}
}
