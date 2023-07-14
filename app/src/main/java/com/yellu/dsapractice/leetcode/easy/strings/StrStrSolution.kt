package com.yellu.dsapractice.leetcode.easy.strings

class StrStrSolution {
    internal fun strStr(haystack: String?, needle: String?): Int {
        if (needle == null || haystack == null || haystack.length < needle.length) {
            return -1
        }
        if (needle.isBlank()) {
            return 0
        }

        for (currentIdx in 0 until (haystack.length-needle.length+1)) {
            if (haystack[currentIdx] == needle[0]) {
                if (haystack.substring(currentIdx, needle.length+currentIdx) == needle){
                    return currentIdx
                }
            }
        }
        return -1
    }
}