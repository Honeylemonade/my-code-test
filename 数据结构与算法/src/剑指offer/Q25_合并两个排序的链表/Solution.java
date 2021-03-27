package 剑指offer.Q25_合并两个排序的链表;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/14 12:32
 */
public class Solution {
    public static class ListNode {
        private int value;
        private ListNode nextNode;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        //robost验证
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode temp = new ListNode(0);
        while (p1 != null && p2 != null) {
            if (p1.value < p2.value) {
                temp.nextNode = p1;
                p1 = p1.nextNode;
                temp = temp.nextNode;
            } else {
                temp.nextNode = p2;
                p2 = p2.nextNode;
                temp = temp.nextNode;
            }
        }
        //进行剩余部分的拼接
        if (p1 == null) {
            temp.nextNode = p2;
        } else {
            temp.nextNode = p1;
        }
        //返回头
        if (list1.value < list2.value) {
            return list1;
        } else {
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        a.nextNode = c;
        c.nextNode = e;
        b.nextNode = d;
        d.nextNode = f;
        System.out.println(new Solution().merge(a, b).value);
    }
}
