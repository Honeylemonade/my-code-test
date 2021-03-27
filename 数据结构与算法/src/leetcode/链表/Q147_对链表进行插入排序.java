package leetcode.链表;

/**
 * Definition for singly-linked list.
 */


class Q147_对链表进行插入排序 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        //dummy头结点
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode temp;

        while (cur.next != null) {
            if (cur.next.val < cur.val) {
                temp = cur.next;
                cur.next = cur.next.next;
                //寻找插入位置
                while (pre != cur) {
                    if (temp.val < pre.next.val) {
                        //插入
                        temp.next = pre.next;
                        pre.next = temp;
                        pre = dummy;
                        break;
                    }
                    pre = pre.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(-1);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(0);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode result = insertionSortList(node1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}