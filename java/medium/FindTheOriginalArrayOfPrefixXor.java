// task №2433

class Solution {
    public int[] findArray(int[] pref) {
        int[] answer = new int[pref.length];
        answer[0] = pref[0];
        for (int i = 1; i < answer.length; i++) {
            answer[i] = pref[i - 1] ^ pref[i];
        }
        return answer;
    }
}
