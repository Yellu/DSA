package com.yellu.dsapractice.leetcode.easy.linkedlist

class MergeSortedLinkedList {
    internal fun merge(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        var localList1 = list1
        var localList2 = list2
        val dummy = ListNode(0)
        var temp: ListNode? = dummy
        while (true) {
            if (localList1 == null) {
                temp?.next = localList2
                break
            }
            if (localList2 == null) {
                temp?.next = localList1
                break
            }

            if (localList1.data < localList2.data) {
                temp?.next = localList1
                localList1 = localList1.next
            } else {
                temp?.next = localList2
                localList2 = localList2.next
            }
            temp = temp?.next
        }
        return dummy.next
    }
}