package leetcode.top_interview_150.remove_duplicates_sorted_array_ii

class RemoveDuplicatesSorted {
    fun handle(nums: IntArray): Int {
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
}
