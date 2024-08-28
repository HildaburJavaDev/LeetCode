// task №3110

class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        char[] symbols = s.toCharArray();
        for (int i = 0; i < symbols.length - 1; i++) {
            int cur = (int)symbols[i];
            int next = (int)symbols[i + 1];
            sum += Math.abs(cur - next);
        }
        return sum;
    }
}
