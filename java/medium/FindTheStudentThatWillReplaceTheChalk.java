// task №1894

class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long chalkNeeded = 0;
        for (int chalkUse : chalk) chalkNeeded += chalkUse;
        int remainingChalk = (int)(k % chalkNeeded);
        for (int i = 0; i < chalk.length; i++) {
            if (chalk[i] > remainingChalk) return i;
            remainingChalk -= chalk[i];
        }
        return 0;
    }
}
