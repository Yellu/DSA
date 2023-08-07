package com.yellu.dsapractice.leetcode.easy.linkedlist

class CycleInLinkedList {
    internal fun detectCycle(node: ListNode?): Int {
        var pos = 1
        var slowNode: ListNode? = node
        var fastNode: ListNode? = node
        while (fastNode?.next != null) {
            print("${slowNode?.data} ===>")
            fastNode = fastNode.next?.next
            slowNode = slowNode?.next
            if (slowNode == fastNode) {
                print("${slowNode?.data} ===>")
                return ++pos
            }
            ++pos

        }
        return -1
    }

    internal fun detectLoopHashing(node: ListNode?): Int {
        val set = HashMap<ListNode, Int>()
        var temp: ListNode? = node
        var count = 1
        while (temp != null) {
            if (set.containsKey(temp)) {
                return set[temp]!!
            }
            print("${temp.data} ===>")
            set[temp] = count
            ++count
            temp = temp.next
        }
        return -1
    }
}