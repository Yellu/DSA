package com.yellu.dsapractice.leetcode.easy.linkedlist

fun main() {
    val first = Node(4)
    first.next = Node(5)
    first.next!!.next = Node(1)
    first.next!!.next?.next = Node(9)
//    val obj = DeleteNode()

//    val delNode = Node(5)
//    obj.deleteNode(first, delNode)

    val reverseObj = ReverseLinkedList()
    println("Before reverse")
    reverseObj.print(first)
    println("After reverse")
    val head = reverseObj.reverse(first)
    reverseObj.print(head)
}