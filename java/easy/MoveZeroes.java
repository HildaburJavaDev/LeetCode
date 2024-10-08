// task №283

class Solution {
    public void moveZeroes(int[] nums) {
        int countZeros = 0, pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos++] = nums[i];
            }
        }
        for (; pos < nums.length; pos++) {
            nums[pos] = 0;
        }
    }
}
