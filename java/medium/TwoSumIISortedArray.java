package medium;

// task № 167

public class TwoSumIISortedArray {
	public static void main(String[] args) {
		int[] arr = twoSum(new int[] { 2, 7, 11, 15 }, 9);
		if (arr != null) {
			for (int elem : arr) {
				System.out.print(elem + " ");
			}
		}
	}

	public static int[] twoSum(int[] numbers, int target) {
		int left = 0, right = numbers.length - 1;
		while (left < right) {
			if (numbers[left] + numbers[right] == target)
				return new int[] { left + 1, right + 1 };
			else if (numbers[left] + numbers[right] > target)
				right--;
			else if (numbers[left] + numbers[right] < target)
				left++;
		}
		return null;
	}
}
