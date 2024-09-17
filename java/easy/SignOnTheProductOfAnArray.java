// task №1822

class Solution {
    public int arraySign(int[] nums) {
        int negative = 0;
        for (int num : nums) {
            if (num < 0) negative++;
            else if (num == 0) return 0;
        }
       return negative % 2 == 0 || negative == 0 ? 1 : -1;
    }
}
