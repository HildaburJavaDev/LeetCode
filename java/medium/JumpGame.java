package medium;

// task № 55

public class JumpGame {
	public static void main(String[] args) {
		System.out.println(canJump(new int[] { 3, 2, 1, 1, 4 }));
	}

	public static boolean canJump(int[] nums) {
		int goal = nums.length - 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (i + nums[i] >= goal) {
				goal = i;
			}
		}
		return goal == 0;
	}
}
