package leetcode.top_interview_150.best_time_to_buy_and_sell_stock

class BestTimeToBuyAndSellStock {
    fun handle(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var profit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else if (price - minPrice > profit) {
                profit = price - minPrice
            }
        }
        return profit
    }
}