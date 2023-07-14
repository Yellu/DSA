package com.yellu.dsapractice.leetcode.easy.array

class MoveAllZero {
    internal fun moveZero(nums: IntArray) {
        var count = 0
        for (i in nums.indices){
            if (nums[i] != 0) {
                nums[count++] = nums[i]
            }
        }
        while (count < nums.size) {
            nums[count++] = 0
        }
        println(nums.contentToString())
   }
}