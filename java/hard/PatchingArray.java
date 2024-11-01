// task №330

class Solution {
    public int minPatches(int[] nums, int n) {
        long patches = 0, maxNumber = 0;
        int i = 0, len = nums.length;

        while (maxNumber < n) {
            if (i < len && maxNumber + 1 >= nums[i]) {
                maxNumber += nums[i++];
            } else {
                patches++;
                maxNumber += (maxNumber + 1);
            }
        }
        return (int) patches;
    }
}
