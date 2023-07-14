package com.yellu.dsapractice.leetcode.easy.strings

import java.lang.Exception

class AtoISolution {
    internal fun aToi(input: String): Int {
        if(input.isBlank()) return 0
        var solution = ""
        var isNegative = false
        run breaking@ {
            input.forEach {
                if (it.isDigit()) {
                    solution+=it
                } else if (solution.isEmpty() && (it == '-' || it == '+')){
                    solution+=it
                    isNegative = it == '-'
                } else if (!it.isDigit() && (solution.isNotEmpty() || !it.isWhitespace())) {
                    return@breaking
                }
            }
        }

        if (!solution.contains("[0-9]".toRegex())) return 0

        return try {
            solution.toInt()
        } catch (e: Exception) {
            if (isNegative) {
                -2147483648
            } else {
                2147483647
            }
        }
    }
}