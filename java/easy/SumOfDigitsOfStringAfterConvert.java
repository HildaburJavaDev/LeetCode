// task №1945

class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            sb.append(String.valueOf((int)c - 96));
        }
        String str = sb.toString();
        int result= 0;
        while (k-- != 0) {
            result = 0;
            for (char c: str.toCharArray()) {
                result += (int) c - '0';
            }
            str= String.valueOf(result);
        }
        return result;
    }
}
