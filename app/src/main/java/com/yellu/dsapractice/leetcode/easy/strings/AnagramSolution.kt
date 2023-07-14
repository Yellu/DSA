package com.yellu.dsapractice.leetcode.easy.strings

class AnagramSolution {
    internal fun isAnagram(first: String, second: String): Boolean {
        if (first.length != second.length) return false
        val map = HashMap<Char, Int>()
        first.forEach {
            if (map.containsKey(it)) {
                map[it] = map[it]!!.plus(1)
            } else {
                map[it] = 1
            }
        }
        second.forEach {
            if (map.containsKey(it)) {
                map[it] = map[it]!!.minus(1)
            } else {
                map[it] = 1
            }
        }

        map.forEach {
            if(it.value != 0) {
                return false
            }
        }
        return true
    }
}