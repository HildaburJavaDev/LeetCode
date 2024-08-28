// task №3146

class Solution {
    public int findPermutationDifference(String s, String t) {
        char[] symb = s.toCharArray();
        int dif = 0;
        for (int i = 0; i < symb.length; i++) {
            dif += Math.abs(i - t.indexOf(symb[i]));
        }
        return dif;
    }
}
