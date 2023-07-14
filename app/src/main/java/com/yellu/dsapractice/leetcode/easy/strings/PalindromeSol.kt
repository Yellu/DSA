package com.yellu.dsapractice.leetcode.easy.strings

import java.lang.StringBuilder

class PalindromeSol {
    internal fun isPalindrome(input: String): Boolean {
        val builder = StringBuilder(input.lowercase())
        var index = 0
        while (index < builder.length) {
            if(builder[index].isLetterOrDigit()) {
                ++index
            } else {
                builder.deleteCharAt(index)
            }
        }

        val size = builder.length
        input.forEachIndexed { i, c ->
            if (i <= size-1-i && c != input[size-1-i]) {
                return false
            }
        }
        return true
    }
}