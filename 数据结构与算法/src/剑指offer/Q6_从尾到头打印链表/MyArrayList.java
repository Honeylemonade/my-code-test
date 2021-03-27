package 剑指offer.Q6_从尾到头打印链表;

import java.util.Stack;

/**
 * MyArrayList:
 * 方法一：从尾到头打印，可以从头到尾遍历，每获取一个元素时，放入栈中，最后统一出栈
 * 方法二：递归的本质也是一种栈的结构，也可以利用递归（虽然代码更简洁，但是当层数深时，可能会堆栈溢出）
 *
 * @author XvYanPeng
 * @date 2019/8/31 9:58
 */
public class MyArrayList {
    /**
     * 内部节点类
     */
    public class Node {
        Integer data;
        Node nextNode;

        public Node(Integer data) {
            this.data = data;
        }
    }

    Integer headData = null;
    Node nextNode = null;
    int myArrayListLength = 0;

    /**
     * @return void
     * @description 在头部插入元素
     * @params [data]
     * @date 2019/8/24
     */
    public void insertNodeAtFront(int data) {
        Node tempNode = new Node(data);
        tempNode.nextNode = this.nextNode;
        this.nextNode = tempNode;
        myArrayListLength++;
    }

    public int getMyArrayListLength() {
        return myArrayListLength;
    }

    /**
     * @return void
     * @description 方法一：利用栈来实现反转打印
     * @params []
     * @date 2019/8/31
     */
    public void reversePrintingByStack() {
        Stack<Integer> stack = new Stack<>();
        Node temp = this.nextNode;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.nextNode;
        }
        //统一出栈
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }
    }

    /**
     * @return void
     * @description 方法二：利用递归
     * @params []
     * @date 2019/8/31
     */
    public void reversePrintingByRecursive() {

        recursiver(nextNode);

    }

    void recursiver(Node node) {
        if (node != null) {
            recursiver(node.nextNode);
            System.out.println(node.data);
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Node tempNode = this.nextNode;
        for (int i = 0; i < myArrayListLength; i++) {
            stringBuffer.append(tempNode.data + "->");
            tempNode = tempNode.nextNode;
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.insertNodeAtFront(4);
        myArrayList.insertNodeAtFront(3);
        myArrayList.insertNodeAtFront(2);
        myArrayList.insertNodeAtFront(1);
        //利用栈
        myArrayList.reversePrintingByStack();
        //利用递归
        myArrayList.reversePrintingByRecursive();
    }
}
