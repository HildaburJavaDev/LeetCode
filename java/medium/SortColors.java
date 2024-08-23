// task № 75

class Solution {
    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;
        while (mid <= right) {
            if (nums[mid] == 0) swap(nums, left++, mid++);
            else if (nums[mid] == 2) swap(nums, right--, mid);
            else mid++;
        }
    }

    private void swap(int[] nums, int left, int index) {
        if (left == index) return;
        int temp = nums[left];
        nums[left] = nums[index];
        nums[index] = temp;
    }
}
