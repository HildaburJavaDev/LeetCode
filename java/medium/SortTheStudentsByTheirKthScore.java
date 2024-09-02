// task №2545

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, new Comparator<int[]>() {
            public int compare(int[] arr1, int[] arr2) {
                return arr1[k] >= arr2[k] ? -1 : 1;
            }
        });
        return score;
    }
}
