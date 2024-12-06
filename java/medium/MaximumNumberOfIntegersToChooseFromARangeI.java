// task №2554

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int count = 0;
        boolean ban[] = new boolean[10001];
        for(int i : banned) {
            ban[i] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!ban[i] && i <= maxSum) {
                count++;
                maxSum -= i;
            }
        }
        return count;
    }
}
