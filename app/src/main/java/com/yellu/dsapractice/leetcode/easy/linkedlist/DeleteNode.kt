package com.yellu.dsapractice.leetcode.easy.linkedlist

class DeleteNode {
    internal fun deleteNode(head: Node, delete: Node) {
        var currentNode = head
        while (currentNode.next != null) {
            if (currentNode.data == delete.data) {
                head.next = currentNode.next
                currentNode.next = null
            } else {
                currentNode = currentNode.next!!
            }
        }

        var temp: Node? = head
        while (temp != null){
            println(temp.data)
            temp = temp.next
        }
    }
}