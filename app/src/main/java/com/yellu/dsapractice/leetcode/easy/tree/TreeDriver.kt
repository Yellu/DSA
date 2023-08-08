package com.yellu.dsapractice.leetcode.easy.tree

fun main() {
//    val root = TreeNode(1)
    //left tree
//    root.leftTree = TreeNode(2)
//    root.leftTree?.leftTree = TreeNode(4)
//    root.leftTree?.rightTree = TreeNode(5)
//    root.leftTree?.rightTree?.leftTree = TreeNode(7)
//
//    //right tree
//    root.rightTree = TreeNode(3)
//    root.rightTree?.rightTree = TreeNode(6)

//    val treeObj = BinaryTreeDepth()
//    val maxDepth = treeObj.maxDepth(root)
//
//    println(maxDepth)

//    val root = TreeNode(2)
//    root.leftTree = TreeNode(1)
//    root.rightTree = TreeNode(3)
//    val bstObj = ValidBST()
//    val isValid = bstObj.isValidBST(root, null, null)
//    println(isValid)

    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(2)
    root.left?.right = TreeNode(3)
//    root.leftTree?.rightTree = TreeNode(4)

//    root.rightTree?.leftTree = TreeNode(4)
    root.right?.right = TreeNode(3)

//    val symObj = SymmetricTree()
//    val isSym = symObj.isSymmetric(root)

//    println(isSym)


    val levelOrderTraversal = LevelOrderTraversal()
    val result = levelOrderTraversal.printLevelOrder(root)
    println(result)
}