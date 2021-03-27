package 剑指offer.Q41_数据流中的中位数;

import java.util.Comparator;
import java.util.PriorityQueue;


/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2019/11/6 21:08
 */
public class Solution {
    //最大堆
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    //最小堆
    static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

    static int count = 1;

    public static void insert(Integer num) {
        if (count % 2 == 1) {
            if (minHeap.size() != 0 && num > minHeap.peek()) {
                minHeap.offer(num);
                maxHeap.offer(minHeap.poll());
            } else {
                maxHeap.offer(num);
            }
        } else {
            if (maxHeap.size() != 0 && num < maxHeap.peek()) {
                maxHeap.offer(num);
                minHeap.offer(maxHeap.poll());
            } else {
                minHeap.offer(num);
            }
        }
        count++;
    }

    public static Double getMedian() {
        if (count % 2 == 0) {
            return Double.valueOf(maxHeap.peek());
        } else {
            return ((double) maxHeap.peek() + (double) minHeap.peek()) / 2;
        }
    }

    public static void main(String[] args) {
        insert(3);
        insert(2);
        insert(1);
        insert(1);
        System.out.println(getMedian());
    }
}
