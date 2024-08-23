// task %2798

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int h : hours) {
            if (h < target) count++;
        }
        return hours.length - count;
    }
}
