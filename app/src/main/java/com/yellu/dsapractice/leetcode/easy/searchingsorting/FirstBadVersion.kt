package com.yellu.dsapractice.leetcode.easy.searchingsorting

class FirstBadVersion {
    internal fun badVersion(size: Int): Int {
        var low = 0
        var high = size
        var mid = -1
        while (low <= high) {
            mid = low + (high - low)/2
            if (isBadVersion(mid)) {
                println(mid)
                high = mid-1
            } else {
                low = mid+1
            }
        }
        return low
    }

    private fun isBadVersion(version: Int): Boolean {
        return version >= 2
    }

}