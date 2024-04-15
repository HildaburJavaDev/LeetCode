package hard;

// task № 135

import java.util.Arrays;

public class Candy {
	public static void main(String[] args) {
		System.out.println(candyCalc(new int[] { 1, 0, 2 }));
	}

	public static int candyCalc(int[] ratings) {
		int length = ratings.length;
		if (length == 0)
			return 0;

		int[] candies = new int[length];
		Arrays.fill(candies, 1);
		int totalCandies = 0;

		for (int i = 1; i < length; i++) {
			if (ratings[i] > ratings[i - 1])
				candies[i] = candies[i - 1] + 1;
		}

		for (int i = length - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				candies[i] = Math.max(candies[i], candies[i + 1] + 1);
			}
		}

		for (int elem : candies) {
			totalCandies += elem;
		}
		return totalCandies;
	}
}
