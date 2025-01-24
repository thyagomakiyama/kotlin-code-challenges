package leetcode.top_interview_150.jump_game

import kotlin.math.max

class JumpGame {
    fun handle(nums: IntArray): Boolean {
        var maxReach = 0

        for (n in nums.indices) {
            if (n > maxReach) return false

            maxReach = max(maxReach, n + nums[n])
            if (maxReach >= nums.size - 1) return true
        }

        return false
    }
}