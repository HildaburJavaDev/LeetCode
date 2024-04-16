package medium;

// task № 11

public class ContainerWithAMostWater {
	public static void main(String[] args) {
		System.out.println(maxArea(new int[] { 1, 1 }));
	}

	public static int maxArea(int[] height) {
		int maxArea = 0;
		int left = 0, right = height.length - 1;
		while (left < right) {
			if (height[left] < height[right]) {
				int currentArea = height[left] * (right - left);
				maxArea = currentArea > maxArea ? currentArea : maxArea;
				left++;
			} else {
				int currentArea = height[right] * (right - left);
				maxArea = currentArea > maxArea ? currentArea : maxArea;
				right--;
			}
		}
		return maxArea;
	}
}
