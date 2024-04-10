package medium;

// leetcode 80

public class RemoveDuplicatesFromSortedArrayII {
	public static void main(String[] args) {
		int nums[] = new int[] { 1, 1, 1, 2, 2, 3 };
		int length = removeDuplicates(nums);
		System.out.println(length);
		for (int i = 0; i < length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static int removeDuplicates(int[] nums) {
		int num = nums[0];
		int amountNumbers = 1;
		int numbers = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == num) {
				amountNumbers++;
				if (amountNumbers > 2) {
					continue;
				} else {
					nums[numbers++] = nums[i];
				}
			} else {
				nums[numbers++] = nums[i];
				num = nums[i];
				amountNumbers = 1;
			}
		}
		return numbers;
	}
}
