public class BestTimeToBuyAndSellStock {
	
	static int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE, max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > max_profit) {
                max_profit = prices[i] - min;
            }
        }

        return max_profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priceSet1 = {7,1,5,3,6,4};
 		System.out.println(maxProfit(priceSet1));
	}
}
