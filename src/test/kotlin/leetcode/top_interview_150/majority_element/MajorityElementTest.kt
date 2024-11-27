package leetcode.top_interview_150.majority_element

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MajorityElementTest : FunSpec ({
    val majorityElement = MajorityElement()

    test("should return 3 to [3,2,3]") {
        majorityElement.handle(intArrayOf(3,2,3)) shouldBe 3
    }

    test("should return 2 to [2,2,1,1,1,2,2]") {
        majorityElement.handle(intArrayOf(2,2,1,1,1,2,2)) shouldBe 2
    }

    test("should return 1 to [1,1,1,1,1,2,2]") {
        majorityElement.handle(intArrayOf(1,1,1,1,1,2,2)) shouldBe 1
    }
})
