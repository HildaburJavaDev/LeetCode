package medium;

// task № 238

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		int[] answer = productExceptSelf(new int[] { 1, 2, 3, 4 });
		for (int elem : answer) {
			System.out.print(" " + elem);
		}
	}

	public static int[] productExceptSelf(int[] nums) {
		int productsAll = 1, amountOfZeros = 0;
		int length = nums.length;
		int[] answer = new int[length];
		for (int elem : nums) {
			if (elem != 0)
				productsAll *= elem;
			else
				amountOfZeros++;
		}
		if (amountOfZeros > 1) {
			return answer;
		} else if (amountOfZeros == 1) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 0)
					answer[i] = productsAll;
			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				answer[i] = productsAll / nums[i];
			}
		}
		return answer;
	}
}
