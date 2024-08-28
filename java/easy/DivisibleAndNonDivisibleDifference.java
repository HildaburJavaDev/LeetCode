// task №2894

class Solution {
    public int differenceOfSums(int n, int m) {
        int divisible = 0, notDivisible = 0;
        for (int i = 1; i <= n; i++) {
            if (i < m || i % m != 0) notDivisible += i;
            else divisible += i;
        }
        return notDivisible - divisible;
    }
}
