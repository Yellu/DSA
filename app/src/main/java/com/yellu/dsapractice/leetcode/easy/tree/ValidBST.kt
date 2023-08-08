package com.yellu.dsapractice.leetcode.easy.tree

class ValidBST {
    internal fun isValidBST(root: TreeNode?, max: Int?, min: Int?): Boolean {
        if (root == null) return true

        if ((max != null && root.`val` >= max) || (min != null && root.`val` <= min))
            return false

        return isValidBST(root.left, root.`val`, min) && isValidBST(root.right, max, root.`val`)
    }
}