package medium;

// task № 334

public class IncreasingTripletSubsequence {
	public static void main(String[] args) {
		System.out.println(increasingTriplet(new int[] { 1, 2, 0, 1, 1 }));
	}

	public static boolean increasingTriplet(int[] nums) {
		if (nums == null || nums.length < 3)
			return false;
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num <= a)
				a = num;
			else if (num <= b)
				b = num;
			else
				return true;
		}
		return false;
	}
}
