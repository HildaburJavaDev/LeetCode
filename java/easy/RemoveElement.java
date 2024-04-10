
// task №27

public class RemoveElement {
	public static void main(String[] args) {
		int nums[] = new int[] { 3, 2, 2, 3 };
		System.out.println(removeElement(nums, 3));
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	// first
	public static int removeElement(int[] nums, int val) {
		int length = nums.length;
		int amountNumbers = 0;
		int nums2[] = new int[length];
		for (int i = 0; i < length; i++) {
			if (nums[i] != val) {
				nums2[amountNumbers++] = nums[i];
			}
		}
		System.arraycopy(nums2, 0, nums, 0, amountNumbers);
		return amountNumbers;
	}

	// second
	public static int removeElement2(int[] nums, int val) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
	}
}
