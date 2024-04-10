package hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		try {
			List<String> input = input();
			int[] nums1 = extractArraysFromSubString(input.get(0).split("[,;\s]"));
			int[] nums2 = extractArraysFromSubString(input.get(1).split("[,;\s]"));
			System.out.println("Median = " + findMedianSortedArrays(nums1, nums2));
		} catch (NumberFormatException ex) {
			System.out.println("Проверьте ввод на соответствие integer. " + ex.getMessage());
		}
	}

	public static int[] extractArraysFromSubString(String[] subStringNumbers) {
		int[] nums = new int[subStringNumbers.length];
		for (int i = 0; i < subStringNumbers.length; i++) {
			nums[i] = Integer.parseInt(subStringNumbers[i]);
		}
		return nums;
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int arr[] = new int[nums1.length + nums2.length];
		int index1 = 0, index2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (index1 == nums1.length) {
				arr[i] = nums2[index2++];
			} else if (index2 == nums2.length) {
				arr[i] = nums1[index1++];
			} else {
				arr[i] = nums1[index1] < nums2[index2] ? nums1[index1++] : nums2[index2++];
			}
		}
		if (arr.length % 2 == 0) {
			return (arr[arr.length / 2 - 1] + arr[(arr.length / 2)]) / 2.0;
		} else {
			return arr[(int) Math.ceil(arr.length / 2.0) - 1];
		}
	}

	public static List<String> input() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("Введите 1 массив чисел");
		list.add(scanner.nextLine());
		System.out.println("Введите 2 массив чисел");
		list.add(scanner.nextLine());
		return list;
	}
}
