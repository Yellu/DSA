package com.yellu.dsapractice.leetcode.easy.strings

class FirstUniqueChar {
    internal fun getChar(str: String): String {
        var outPutChar = '$'
        var count = 0

        for (i in str.toCharArray()) {
            if(str.indexOf(i) == str.lastIndexOf(i)) {
                outPutChar = i
                break
            } else {
                ++count
            }
        }

        return if (count == str.length || outPutChar == '$') {
            "No unique found"
        } else {
            outPutChar.toString()
        }
    }
}