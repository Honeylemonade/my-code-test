package 剑指offer.Q30_包含min函数的栈;

import java.util.Stack;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/22 13:19
 */
public class Solution {
    //定义主栈
    private Stack<Integer> mainStack = new Stack<>();
    //定义辅助栈
    private Stack<Integer> assistStack = new Stack<>();

    public void push(int value) {
        mainStack.push(value);
        if (assistStack.empty()) {
            assistStack.push(value);
        } else {
            if (assistStack.peek() > value) {
                assistStack.push(value);
            } else {
                assistStack.push(assistStack.peek());
            }
        }
    }

    public int pop() {
        assistStack.pop();
        return mainStack.pop();
    }

    public int min() {
        return assistStack.peek();
    }

    public static void main(String[] args) {
        Solution myStack = new Solution();
        myStack.push(5);
        System.out.println(myStack.min());
        myStack.push(3);
        System.out.println(myStack.min());
        myStack.push(6);
        System.out.println(myStack.min());
        myStack.push(1);
        System.out.println(myStack.min());


    }
}
