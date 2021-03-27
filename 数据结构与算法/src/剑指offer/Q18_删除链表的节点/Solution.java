package 剑指offer.Q18_删除链表的节点;

import java.util.List;

/**
 * Solution:利用覆盖的办法，不同于通常的改变next值
 *
 * @author XvYanPeng
 * @date 2019/10/9 19:00
 */
public class Solution {
    public static class ListNode {
        private int value;
        private ListNode nextNode;
    }

    public static void deleteNode(ListNode head, ListNode toBeDeleted) {
        //删除的为末尾节点
        if (toBeDeleted.nextNode == null) {
            ListNode pre = head;
            ListNode temp = head.nextNode;
            while (temp != toBeDeleted) {
                pre = pre.nextNode;
                temp = temp.nextNode;
            }
            pre.nextNode = null;
        } else {
            toBeDeleted.value = toBeDeleted.nextNode.value;
            toBeDeleted.nextNode = toBeDeleted.nextNode.nextNode;
        }

    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode listNode1 = new ListNode();
        listNode1.value = 1;
        head.nextNode = listNode1;
        deleteNode(head, listNode1);
        ListNode temp = head.nextNode;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.nextNode;
        }

    }
}
