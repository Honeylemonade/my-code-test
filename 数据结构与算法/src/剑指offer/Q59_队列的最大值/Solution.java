package 剑指offer.Q59_队列的最大值;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/20 10:26
 */
public class Solution {
    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
        //数组长度
        int arraySize = num.length;
        //滑动窗口的个数
        int windowsCount = num.length - size + 1;
        ArrayList<Integer> resultList = new ArrayList();
        Deque deque = new ArrayDeque();
        int left = 0;
        int right = 0;
        int tempMaxIndex = 0;
        deque.addFirst(tempMaxIndex);
        for (int i = 0; i < size - 1; i++) {
            right++;
            if (num[right] > num[tempMaxIndex]) {
                tempMaxIndex = right;
                deque.removeFirst();
                deque.addLast(right);
            }
        }
        resultList.add(tempMaxIndex);
        for (int i = 0; i < windowsCount - 1; i++) {
            left++;
            right++;
            if (num[right] >= num[tempMaxIndex]) {
                deque.removeAll(deque);
                deque.addFirst(right);
                tempMaxIndex = right;
            }
            if (num[right] < num[tempMaxIndex]) {
                if (left <= tempMaxIndex) {
                    if (deque.size() == 1) {
                        deque.addLast(right);
                    } else if (num[(Integer) deque.getLast()] < num[right]) {
                        deque.removeLast();
                        deque.addLast(right);
                    }
                } else {
                    deque.removeFirst();
                    tempMaxIndex = (Integer) deque.getFirst();
                }
            }
            resultList.add(tempMaxIndex);
        }
        //TODO  index转换成值
        ArrayList<Integer> valueList = new ArrayList<>();
        for (int i : resultList) {
            valueList.add(num[i]);
        }
        return valueList;
    }

    public static void main(String[] args) {
        int[] num = {2, 3, 4, 2, 6, 2, 5, 1};
        System.out.println(maxInWindows(num, 3));
    }
}
