package com.yellu.dsapractice.leetcode.easy.tree

class ValidBST {
    internal fun isValidBST(root: TreeNode?, max: Int?, min: Int?): Boolean {
        if (root == null) return true

        if ((max != null && root.data >= max) || (min != null && root.data <= min))
            return false

        return isValidBST(root.leftTree, root.data, min) && isValidBST(root.rightTree, max, root.data)
    }
}