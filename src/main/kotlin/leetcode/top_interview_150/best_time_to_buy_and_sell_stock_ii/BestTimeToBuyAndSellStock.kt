package leetcode.top_interview_150.best_time_to_buy_and_sell_stock_ii

class BestTimeToBuyAndSellStock {
    fun handle(prices: IntArray): Int {
        var profit = 0

        for (i in 1 until prices.size) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1]
            }
        }

        return profit
    }
}