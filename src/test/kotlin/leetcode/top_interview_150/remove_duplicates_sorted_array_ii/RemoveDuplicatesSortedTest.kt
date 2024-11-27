package leetcode.top_interview_150.remove_duplicates_sorted_array_ii

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RemoveDuplicatesSortedTest : FunSpec({
    val removeDuplicatesSorted = RemoveDuplicatesSorted()

    test("should 5 when nums = [1,1,1,2,2,3]") {
        removeDuplicatesSorted.handle(intArrayOf(1, 1, 1, 2, 2, 3)) shouldBe 5
    }

    test("should 7 when nums = [0,0,1,1,1,1,2,3,3]") {
        removeDuplicatesSorted.handle(intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)) shouldBe 7
    }
})