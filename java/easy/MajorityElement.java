// task № 169

import java.util.Arrays;

public class MajorityElement {
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 6, 6, 6, 7, 7 }));
	}

	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int elem = nums[0], currentElem = nums[0];
		int frequency = 1, currentFrequency = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == currentElem) {
				currentFrequency++;
			} else {
				currentElem = nums[i];
				currentFrequency = 1;
			}
			if (currentFrequency > frequency) {
				frequency = currentFrequency;
				elem = currentElem;
			}
		}
		return elem;
	}
}
