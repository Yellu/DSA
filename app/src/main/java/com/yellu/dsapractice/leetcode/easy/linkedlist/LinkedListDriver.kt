package com.yellu.dsapractice.leetcode.easy.linkedlist

fun main() {
//    val first = ListNode(1)
//    first.next = ListNode(2)
//    first.next!!.next = ListNode(4)
//    first.next!!.next?.next = ListNode(8)
//
//    val second = ListNode(8)
//    first.next!!.next?.next?.next = second
//    second.next = ListNode(4)
//    second.next!!.next = ListNode(2)
//    second.next!!.next?.next = ListNode(1)
//    val obj = DeleteNode()

//    val delNode = Node(5)
//    obj.deleteNode(first, delNode)

//    val reverseObj = ReverseLinkedList()
//    println("Before reverse")
//    reverseObj.print(first)
//    println("After reverse")
//    val head = reverseObj.reverse(first)
//    reverseObj.print(head)

//    val merge = MergeSortedLinkedList()
//    println("Before merge")
//    reverseObj.print(first)
//    reverseObj.print(second)
//    println("After merge")
//    val head = merge.merge(first, second)
//    reverseObj.print(head)

//    val palindromeSol = PalindromeLinkedList()
//    palindromeSol.isPalindrome(first)

    val first = ListNode(1)
    first.next = ListNode(2)
    first.next!!.next = ListNode(4)
    first.next!!.next?.next = ListNode(8)
    first.next?.next?.next?.next = first.next?.next

    val cycleObj = CycleInLinkedList()
    var pos = cycleObj.detectLoopHashing(first)
    println()
    println(pos)

    pos = cycleObj.detectCycle(first)
    println()
    println(pos)
}