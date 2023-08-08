package com.yellu.dsapractice.leetcode.easy.tree

class BinaryTreeDepth {
    internal fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)

       return leftDepth.coerceAtLeast(rightDepth) +1
    }
}