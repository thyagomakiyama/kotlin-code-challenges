package leetcode.top_interview_150.best_time_to_buy_and_sell_stock

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class BestTimeToBuyAndSellStockTest : FunSpec({
    val bestTimeToBuyAndSellStock = BestTimeToBuyAndSellStock()

    test("Test 1") {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 5
        bestTimeToBuyAndSellStock.handle(prices) shouldBe expected
    }

    test("Test 2") {
        val prices = intArrayOf(7, 6, 4, 3, 1)
        val expected = 0
        bestTimeToBuyAndSellStock.handle(prices) shouldBe expected
    }

    test("Test 3") {
        val prices = intArrayOf(1,2)
        val expected = 1
        bestTimeToBuyAndSellStock.handle(prices) shouldBe expected
    }
})
