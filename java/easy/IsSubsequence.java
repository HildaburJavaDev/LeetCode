// task №392

class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (char ch : s.toCharArray()) {
            index = t.indexOf(ch, index);
            if (index == - 1) return false;
            index++;
        }
        return true;
    }
}
