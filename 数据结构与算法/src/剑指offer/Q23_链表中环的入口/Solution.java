package 剑指offer.Q23_链表中环的入口;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/14 10:43
 */
public class Solution {

    public static class ListNode {
        private int value;
        private ListNode nextNode;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode entryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        //判断链表是否构成环
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        do {
            p1 = p1.nextNode;
            p2 = p2.nextNode;
            p2 = p2.nextNode;
        } while (p2 != null && p1 != p2);
        if (p1 == p2) {
            //存在环，开始寻找
            int ringLength = 0;
            do {
                p1 = p1.nextNode;
                ringLength++;
            } while (p1 != p2);
            p1 = pHead;
            p2 = pHead;
            for (int i = 0; i < ringLength; i++) {
                p2 = p2.nextNode;
            }
            while (p1 != p2) {
                p1 = p1.nextNode;
                p2 = p2.nextNode;
            }
            return p1;
        } else {
            //没有环
            System.out.println("没有环");
            return null;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;
        f.nextNode = c;
        System.out.println(new Solution().entryNodeOfLoop(a).value);

    }
}
