package com.yellu.dsapractice.leetcode.easy.linkedlist

class ReverseLinkedList {
    internal fun reverse(head: ListNode?): ListNode? {
        var prevListNode: ListNode? = null
        var currentListNode: ListNode? = head
        var nextListNode: ListNode? = null
        while (currentListNode != null) {
            nextListNode = currentListNode.next
            currentListNode.next = prevListNode
            prevListNode = currentListNode
            currentListNode = nextListNode
        }
        return prevListNode
    }

    internal fun print(head: ListNode?) {
        var temp: ListNode? = head
        while (temp != null) {
            println(temp.data)
            temp = temp.next
        }
    }
}