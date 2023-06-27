package com.yellu.dsapractice.leetcode.easy.array

class PlusOne {
    /**
     * add plus one
     */
    internal fun addPlusOne(array: IntArray): IntArray {
        var digits = array
        for (i in digits.size-1 downTo 0) {
            if (digits[i] < 9){
                ++digits[i]
                return digits
            }
            digits[i] = 0
        }
        digits = IntArray(digits.size+1)
        digits[0] = 1
        return digits
    }
}