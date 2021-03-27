package 剑指offer.Q35_复杂链表的复制;

import java.util.Random;

/**
 * Solution:
 * 分成三步走，时间复杂度和空间复杂度都很低
 * 此外，牛客网这道题并无法通过，总是返回null，很奇怪。o(╥﹏╥)o
 *
 * @author XvYanPeng
 * @date 2019/10/26 22:18
 */
public class Solution {
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public static RandomListNode clone(RandomListNode pHead) {
        //验证
        if (pHead == null) {
            return null;
        }
        RandomListNode temp = pHead;
        RandomListNode resultHead;
        //创建node'
        while (temp != null) {
            RandomListNode inNode = new RandomListNode(temp.label);
            inNode.next = temp.next;
            temp.next = inNode;
            temp = temp.next.next;
        }
        //生成连接'
        temp = pHead;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        //进行链表分离

        temp = pHead.next;
        resultHead = pHead.next;
        while (temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return resultHead;
    }

    public static void main(String[] args) {
        RandomListNode a = new RandomListNode(1);
        RandomListNode b = new RandomListNode(2);
        RandomListNode c = new RandomListNode(3);
        RandomListNode d = new RandomListNode(4);
        RandomListNode e = new RandomListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        a.random = c;
        b.random = e;
        d.random = b;
        RandomListNode pHead = clone(a);
        RandomListNode temp = pHead;
        while (temp != null) {
            if (temp.random != null) {
                System.out.print(temp.label);
                System.out.print(":");
                System.out.println(temp.random.label);
            } else {
                System.out.println(temp.label);
            }
            temp = temp.next;
        }
    }
}
