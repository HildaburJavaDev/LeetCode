// task №462

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int mid = nums.length / 2;
        for (int num : nums) {
            count += Math.abs(num - nums[mid]);
        }
        return count;
    }
}
