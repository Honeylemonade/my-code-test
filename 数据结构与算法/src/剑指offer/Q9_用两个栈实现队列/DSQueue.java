package 剑指offer.Q9_用两个栈实现队列;

import java.util.Stack;

/**
 * Solution:DSQueue 是doule stack queue的简称
 * 分四种情况：
 * 入队->出队：换容器，出队栈pop
 * 入队->入队：不换，入队栈push
 * 出队->入队：换容器，入队栈push
 * 出队->出队：不换，出队栈pop
 *
 * @author XvYanPeng
 * @date 2019/9/6 12:18
 */
public class DSQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (stack2.size() != 0) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        while (stack1.size() != 0) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }


    public static void main(String[] args) {
        DSQueue dsQueue = new DSQueue();
        dsQueue.push(1);
        dsQueue.push(2);
        dsQueue.push(3);
        dsQueue.pop();
        dsQueue.pop();
    }
}
