package com.yellu.dsapractice.leetcode.easy.tree

import java.util.LinkedList
import java.util.Queue

class LevelOrderTraversal {
    internal fun printLevelOrder(node: TreeNode?): List<List<Int>> {
        if (node == null) return emptyList()

        val result = mutableListOf<MutableList<Int>>()
        val queue:Queue<TreeNode> = LinkedList()
        queue.add(node)

        while (queue.isNotEmpty()) {
            val levelNodes = mutableListOf<Int>()
            val levelSize = queue.size
            for (i in 0 until levelSize) {
                val currentNode = queue.remove()
                levelNodes.add(currentNode.`val`)
                currentNode.left?.let { queue.add(it) }
                currentNode.right?.let { queue.add(it) }
            }
            result.add(levelNodes)
        }
        return result
    }
}