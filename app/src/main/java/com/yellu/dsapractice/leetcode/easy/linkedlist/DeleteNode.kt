package com.yellu.dsapractice.leetcode.easy.linkedlist

class DeleteNode {
    internal fun deleteNode(head: ListNode, delete: ListNode) {
        var currentNode = head
        while (currentNode.next != null) {
            if (currentNode.data == delete.data) {
                head.next = currentNode.next
                currentNode.next = null
            } else {
                currentNode = currentNode.next!!
            }
        }

        var temp: ListNode? = head
        while (temp != null){
            println(temp.data)
            temp = temp.next
        }
    }
}