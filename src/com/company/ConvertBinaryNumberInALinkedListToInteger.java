package com.company;

import java.util.LinkedList;

//1290. Convert Binary Number in a Linked List to Integer
public class ConvertBinaryNumberInALinkedListToInteger {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) throws Exception {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(1);

        listNode.next = listNode1;
        listNode1.next = listNode2;

        System.out.println("result " + getDecimalValue(listNode));

    }

    public static int getDecimalValue(ListNode head) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (head != null) {
            linkedList.add(head.val);
            head = head.next;
        }
        int count = 0;
        int result = 0;
        for (int i = linkedList.size() - 1; i >= 0; --i) {
            result += (linkedList.get(i) * Math.pow(2, count));
            count++;
        }
        return result;
    }
}
