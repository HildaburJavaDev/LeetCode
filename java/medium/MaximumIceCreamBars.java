// task №1833

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        while (coins >= costs[count]) {
            coins -= costs[count];
            count++;
            // System.out.println("coins: " + coins + " count: " + count);
            if (count == costs.length) return count;
        }
        return count;
    }
}
