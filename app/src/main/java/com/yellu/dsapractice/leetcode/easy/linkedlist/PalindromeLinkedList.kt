package com.yellu.dsapractice.leetcode.easy.linkedlist

class PalindromeLinkedList {
    internal fun isPalindrome(head: ListNode?): Boolean {
        var temp: ListNode? = head
        var slowNode: ListNode? = head
        var fastNode: ListNode? = head
        var midNode: ListNode? = null
        var prevNode: ListNode? = head
        var isPalindrome = false

        while (fastNode?.next != null) {
            fastNode = fastNode.next?.next
            prevNode = slowNode
            slowNode = slowNode?.next
        }

        if (fastNode != null) {
            midNode = slowNode
            slowNode = slowNode?.next
        }

        prevNode?.next = null
        val rightNode = slowNode
        var temp2 = reverse(rightNode)
        while (temp != null && temp2 != null) {
            if (temp.data == temp2.data) {
                temp = temp.next
                temp2 = temp2.next
                isPalindrome = true
            } else {
                isPalindrome = false
                break
            }
        }
        slowNode = reverse(rightNode)
        if (midNode != null) {
            prevNode?.next = midNode
            midNode.next = slowNode
        } else {
            prevNode?.next = rightNode
        }
        return isPalindrome
    }

    private fun reverse(node: ListNode?): ListNode? {
        var next: ListNode?
        var current: ListNode? = node
        var prev: ListNode? = null

        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        return prev
    }
}