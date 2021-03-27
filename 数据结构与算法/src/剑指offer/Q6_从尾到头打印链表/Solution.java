package 剑指offer.Q6_从尾到头打印链表;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/24 7:40
 */
public class Solution {
    public static void printListReversinglyRecursively(Node head) throws Exception {
        if (head == null) {
            throw new Exception("链表为空");
        }
        core(head);

    }

    public static void core(Node node) {
        if (node.next == null) {
            System.out.println(node.data);
        } else {
            core(node.next);
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) throws Exception {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        printListReversinglyRecursively(n1);
    }
}
