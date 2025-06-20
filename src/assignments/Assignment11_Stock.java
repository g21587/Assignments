package assignments;

public class Assignment11_Stock {

	public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("Maximum Profit (Example 1): " + maxProfit(prices1)); // Output: 5
        System.out.println("Maximum Profit (Example 2): " + maxProfit(prices2)); // Output: 0
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update minimum price so far
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if sold today and update max profit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}