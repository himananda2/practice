package sdet;

public class MaxProfit {

	public static void main(String[] args) {

		int[] prices = { 9, 0, 6, 2, 5, 2, 7 };

		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int prices[]) {
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minprice)
				minprice = prices[i];
			else if (prices[i] - minprice > maxprofit)
				maxprofit = prices[i] - minprice;
		}
		return maxprofit;
	}
}
