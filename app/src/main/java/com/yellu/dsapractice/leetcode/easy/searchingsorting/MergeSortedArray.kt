package com.yellu.dsapractice.leetcode.easy.searchingsorting

import android.util.Log

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1
        var k = m + n - 1
        while (j >= 0 && i >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]
            } else {
                nums1[k--] = nums2[j--]
            }
        }

//        var index = 0
//        var num1Indx = 0
//        var num2Indx = 0
//        while (num1Indx < m && num2Indx < n) {
//            if (nums1[num1Indx] <= nums2[num2Indx]) {
//                result[index++] = nums1[num1Indx++]
//            } else {
//                result[index++] = nums2[num2Indx++]
//            }
//        }
//        while (num1Indx < m ) {
//            result[index++] = nums1[num1Indx++]
//        }
//
//        while (num2Indx < n) {
//            result[index++] = nums2[num2Indx++]
//        }
//        println(result.contentToString())
    }
}