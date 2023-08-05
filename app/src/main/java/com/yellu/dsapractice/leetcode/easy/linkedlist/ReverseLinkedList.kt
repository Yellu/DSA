package com.yellu.dsapractice.leetcode.easy.linkedlist

class ReverseLinkedList {
    internal fun reverse(head: Node?): Node? {
        var prevNode: Node? = null
        var currentNode: Node? = head
        var nextNode: Node? = null
        while (currentNode != null) {
            nextNode = currentNode.next
            currentNode.next = prevNode
            prevNode = currentNode
            currentNode = nextNode
        }
        return prevNode
    }

    internal fun print(head: Node?) {
        var temp: Node? = head
        while (temp != null) {
            println(temp.data)
            temp = temp.next
        }
    }
}