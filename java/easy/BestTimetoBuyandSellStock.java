// task № 121

public class BestTimetoBuyandSellStock {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
	}

	public static int maxProfit(int[] prices) {
		int buy = prices[0];
		int difference = 0;
		for (int i = 1; i < prices.length; i++) {
			if (buy > prices[i]) {
				buy = prices[i];
			} else if (prices[i] - buy > difference) {
				difference = prices[i] - buy;
			}
		}
		return difference;
	}
}
