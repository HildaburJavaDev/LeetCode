// task №389

class Solution {
    public char findTheDifference(String s, String t) {
        int sum_1 = 0, sum_2 = 0;
        for (char ch : s.toCharArray()) sum_1 += ch;
        for (char ch: t.toCharArray()) sum_2 += ch;
        return (char)(sum_2 - sum_1);
    }
}
