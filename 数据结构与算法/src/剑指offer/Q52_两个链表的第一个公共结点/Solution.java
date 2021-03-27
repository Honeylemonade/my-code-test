package 剑指offer.Q52_两个链表的第一个公共结点;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/17 14:51
 */
public class Solution {
    public static Node findfirstCommonNode(Node list1, Node list2) {
        //遍历两个链表的长度
        int length1 = 0;
        int length2 = 0;
        Node p1;
        Node p2;
        p1 = list1;
        while (p1 != null) {
            length1++;
            p1 = p1.next;
        }
        p2 = list2;
        while (p2 != null) {
            length2++;
            p2 = p2.next;
        }
        //长的首先走
        p1 = list1;
        p2 = list2;
        int distance = Math.abs(length1 - length2);
        if (length1 > length2) {
            for (int i = 0; i < distance; i++) {
                p1 = p1.next;
            }
        } else {
            for (int i = 0; i < distance; i++) {
                p2 = p2.next;
            }
        }
        //遇到相同结点则返回
        for (int i = 0; i < Math.min(length1, length2); i++) {
            if (p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null);
        Node n2 = new Node(2, null);
        Node n3 = new Node(3, null);
        Node n4 = new Node(4, null);
        Node n5 = new Node(5, null);
        Node n6 = new Node(6, null);
        Node n7 = new Node(7, null);
        n1.next = n2;
        n2.next = n3;
        n3.next = n6;
        n6.next = n7;
        n4.next = n5;
        n5.next = n6;
        System.out.println(findfirstCommonNode(n1, n4).value);

    }
}
