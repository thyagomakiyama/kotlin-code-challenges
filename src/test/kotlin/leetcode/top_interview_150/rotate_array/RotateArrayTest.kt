package leetcode.top_interview_150.rotate_array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RotateArrayTest : FunSpec({
    val rotateArray = RotateArray()

    test("rotate array [1,2,3,4,5,6,7] by 3") {

        val input = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val output = intArrayOf(5, 6, 7, 1, 2, 3, 4)

        rotateArray.handle(input, 3) shouldBe output
    }

    test("rotate array [-1,-100,3,99] by 2") {

        val input = intArrayOf(-1, -100, 3, 99)
        val output = intArrayOf(3, 99, -1, -100)

        rotateArray.handle(input, 2) shouldBe output
    }
})
