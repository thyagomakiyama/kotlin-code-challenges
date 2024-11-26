package leetcode.top_interview_150.remove_duplicates_sorted_array_ii

fun removeDuplicates(nums: IntArray): Int {
    if (nums.size <= 2) return nums.size

    var index = 2
    for (i in 2 until nums.size) {
        if (nums[i] != nums[index - 2]) {
            nums[index] = nums[i]
            index++
        }
    }

    return index
}

fun main() {
    println("---- Remove duplicates sorted array 2 ----")
    println("Test 1: Expected 5 | Result: ${removeDuplicates(intArrayOf(1,1,1,2,2,3))}")
    println("Test 2: Expected 7 | Result: ${removeDuplicates(intArrayOf(0,0,1,1,1,1,2,3,3))}")
}
