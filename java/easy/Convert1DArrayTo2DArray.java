// task №2022

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) return new int[0][0];
        int [][] converted = new int[m][n];
        int row = 0, col = 0;
        for (int i = 0; i < original.length; i++) {
            if (col == n) {
                row++;
                col = 0;
            }
            converted[row][col++] = original[i];
        }
        return converted;
    }
}
