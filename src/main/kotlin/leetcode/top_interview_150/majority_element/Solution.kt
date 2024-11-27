package leetcode.top_interview_150.majority_element

fun majorityElement(nums: IntArray): Int {
    // Boyer-Moore Voting Algorithm
    var count = 0
    var candidate: Int? = null

    for (num in nums) {
        if (count == 0) {
            candidate = num
        }
        count += if (num == candidate) 1 else -1
    }

    return candidate!!
}

fun main() {
    println("---- Majority Elements ----")
    println("Test 1: Expected 3 | Result: ${majorityElement(intArrayOf(3,2,3))}")
    println("Test 2: Expected 2 | Result: ${majorityElement(intArrayOf(2,2,1,1,1,2,2))}")
    println("Test 3: Expected 1 | Result: ${majorityElement(intArrayOf(1,1,1,1,1,2,2))}")
}