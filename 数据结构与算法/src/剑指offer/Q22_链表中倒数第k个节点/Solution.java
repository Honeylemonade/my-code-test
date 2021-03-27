package 剑指offer.Q22_链表中倒数第k个节点;

/**
 * Solution:感觉题目的解答有问题，两个指针的话，本质上仍然是遍历了两次链表
 *
 * @author XvYanPeng
 * @date 2019/10/13 14:13
 */
public class Solution {
    public static class ListNode {
        private int value;
        private ListNode nextNode;
    }

    public ListNode findndKthToTail(ListNode listHead, int k) {
        if (listHead == null || k < 1) {
            return null;
        }
        int length = 0;
        ListNode temp = listHead;
        while (temp.nextNode != null) {
            length++;
            temp = temp.nextNode;
        }
        if (k > length) {
            return null;
        }
        temp = listHead;
        for (int i = 0; i < length + 1 - k; i++) {
            temp = temp.nextNode;
        }
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        listNode1.value = 1;
        listNode2.value = 2;
        listNode3.value = 3;
        head.nextNode = listNode1;
        listNode1.nextNode = listNode2;
        listNode2.nextNode = listNode3;
        System.out.println(new Solution().findndKthToTail(head, 54).value);
    }
}
