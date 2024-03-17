package com.company;


public class LinkedList {

//Remove Nth node from the linked List
//Given the head of a linked list, remove the nth node from the end of the list and return its head.
public ListNode removeNthFromEnd(ListNode head, int n) {
    // Create a dummy node and attach it to the head of the input list.
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    // Initialize two pointers: first and second, both pointing to the dummy node.
    ListNode first = dummy;
    ListNode second = dummy;

    // Move the first pointer n steps ahead.
    for (int i = 0; i <= n; i++) {
        first = first.next;
    }

    // Move both first and second pointers until the first pointer reaches the end.
    while (first != null) {
        first = first.next;
        second = second.next;
    }

    // Delete the node pointed to by the second pointer.
    second.next = second.next.next;

    // Return the modified head.
    return dummy.next;
}
}
