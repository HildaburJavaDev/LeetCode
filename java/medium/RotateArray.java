package medium;

// task № 189

public class RotateArray {
	public static void main(String[] args) {
		int nums[] = new int[] { 1, 2 };
		rotate(nums, 3);
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	public static void rotate(int[] nums, int k) {
		if (k > nums.length)
			k %= nums.length;
		int temp[] = new int[k];
		for (int i = nums.length - k, j = 0; i < nums.length; i++) {
			temp[j++] = nums[i];
		}
		for (int i = nums.length - 1; i >= k; i--) {
			nums[i] = nums[i - k];
		}
		for (int i = 0; i < k; i++) {
			nums[i] = temp[i];
		}
	}
}
