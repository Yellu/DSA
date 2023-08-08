package com.yellu.dsapractice.leetcode.easy.tree

class SymmetricTree {

    internal fun isSymmetric(node: TreeNode?): Boolean {
        return isMirror(node, node)
    }

    private fun isMirror(root1: TreeNode?, root2: TreeNode?): Boolean {
        if (root1 == null && root2 == null) return true

        if ((root1 != null && root2 != null) && (root1.`val` == root2.`val`)) {
            return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left)
        }
        return false
    }
}