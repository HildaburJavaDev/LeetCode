// task №2011

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations) {
            x = s.charAt(1) == '+' ? x + 1 : x - 1;
        }
        return x;
    }
}
