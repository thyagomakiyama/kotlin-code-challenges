package leetcode.top_interview_150.jump_game

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class JumpGameTest : FunSpec ({
    val jumpGame = JumpGame()

    test("should return true to [2,3,1,1,4]") {
        val input = intArrayOf(2,3,1,1,4)
        jumpGame.handle(input) shouldBe  true
    }

    test("should return false to [3,2,1,0,4]") {
        val input = intArrayOf(3,2,1,0,4)
        jumpGame.handle(input) shouldBe false
    }
})