package sample.practice.programs;

public class MaxProfit {

	public static void main(String[] args) {

		int stockPrices[] = { 5, 3, 2, 9, 6, 10, 1 };

		int minPrice = Integer.MAX_VALUE;

		int maxprofit = 0;

		for (int i = 0; i < stockPrices.length; i++) {

			if (stockPrices[i] < minPrice) {
				minPrice = stockPrices[i];
			}

			else if (maxprofit < stockPrices[i] - minPrice) {
				maxprofit = stockPrices[i] - minPrice;
			}
		}
		System.out.println("maxprofit : " + maxprofit);

	}

}
