package com.yellu.dsapractice.leetcode.easy.array

fun main() {
    val obj = PlusOne()
    val input = IntArray(4)
    input[0] = 1
    input[1] = 2
    input[2] = 3
    input[3] = 9
    println(obj.addPlusOne(input).contentToString())
}