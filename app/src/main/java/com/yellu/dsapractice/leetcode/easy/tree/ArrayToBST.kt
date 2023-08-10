package com.yellu.dsapractice.leetcode.easy.tree

import android.util.Log
import java.util.LinkedList
import java.util.Objects

class ArrayToBST {
    internal fun sortedArrayToBST(array: IntArray): TreeNode? {
        return arrayToBSTIterative(array)
//        return arrayToBSTRecursion(array, 0, array.size-1)
    }

    private fun arrayToBSTRecursion(array: IntArray, start: Int, end: Int): TreeNode? {
        if (start > end) return null
        val midIndex = (start+end)/2
        val root = TreeNode(array[midIndex])

        root.left = arrayToBSTRecursion(array, start, midIndex-1)
        root.right = arrayToBSTRecursion(array, midIndex+1, end)

        return root
    }

    private fun arrayToBSTIterative(array: IntArray): TreeNode? {
        if (array.isEmpty()) return null
        var mid = array.size/2
        val root = TreeNode(array[mid])

        val queue = LinkedList<Pair<TreeNode, IntArray>>()
        queue.add(Pair(root, intArrayOf(0, mid-1)))
        queue.add(Pair(root, intArrayOf(mid+1, array.size-1)))

        while (queue.isNotEmpty()) {
            val current = queue.remove()
            val parent = current.first
            val indices = current.second
            val left = indices[0]
            val right = indices[1]

            if (left <= right) {
                mid = (left+right)/2
                val childNode = TreeNode(array[mid])
                if (childNode.`val` < parent.`val`) {
                    parent.left = childNode
                } else {
                    parent.right = childNode
                }

                queue.add(Pair(childNode, intArrayOf(left, mid-1)))
                queue.add(Pair(childNode, intArrayOf(mid+1, right)))
            }
        }

        return root
    }
}