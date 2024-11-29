package leetcode.top_interview_150.rotate_array

class RotateArray {
    fun handle(nums: IntArray, k: Int): IntArray {
        val n = nums.size
        val steps = k % n
        reverse(nums, 0, n - 1)
        reverse(nums, 0, steps - 1)
        reverse(nums, steps, n - 1)

        return nums
    }

    private fun reverse(nums: IntArray, start: Int, end: Int) {
        var i = start
        var j = end
        while (i < j) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i++
            j--
        }
    }
}