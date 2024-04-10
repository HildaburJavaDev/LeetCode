import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String[] args) {
		int nums1[] = new int[] { 1, 2, 3, 0, 0, 0 };
		int nums2[] = new int[] { 2, 5, 6 };
		merge(nums1, 3, nums2, 3);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = m, j = 0; i < m + n; i++, j++) {
			nums1[i] = nums2[j];
			System.out.println("i = " + i + " j = " + j);
		}
		Arrays.sort(nums1);
	}
}
