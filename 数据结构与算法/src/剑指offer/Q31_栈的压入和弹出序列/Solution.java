package 剑指offer.Q31_栈的压入和弹出序列;

import java.util.Stack;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/22 15:29
 */
public class Solution {
    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        if (pushA == null || popA == null) {
            return false;
        }
        if (pushA.length != popA.length) {
            return false;
        }
        int indexA = 0;
        int indexB = 0;
        while (indexB < popA.length) {
            while (stack.empty() || stack.peek() != popA[indexB]) {
                if (indexA == pushA.length) {
                    return false;
                }
                stack.push(pushA[indexA]);
                indexA++;
            }
            stack.pop();
            //找到匹配的元素
            indexB++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {4, 5, 3, 2, 1};
        int[] popB = {4, 5, 3, 1, 2};
        System.out.println(IsPopOrder(pushA, popB));
    }
}
