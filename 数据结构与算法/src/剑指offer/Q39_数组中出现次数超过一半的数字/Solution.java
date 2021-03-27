package 剑指offer.Q39_数组中出现次数超过一半的数字;

import java.util.ArrayList;
import java.util.Random;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2019/11/4 8:09
 */
public class Solution {
    public static int moreThanHalfNum(int[] array) {
        if (array == null) {
            return 0;
        }
        int middle = array.length / 2;
        int start = 0;
        int end = array.length - 1;
        int index = partition(array, 0, array.length - 1);
        while (index != middle) {
            if (index < middle) {
                start = index + 1;
                index = partition(array, start, end);
            } else {
                end = index - 1;
                index = partition(array, start, end);
            }
        }
        return array[index];
    }

    /**
     * @Author XvYanpeng
     * @Description 随机取一个数，进行排序，使左面元素都比他小，右面元素都比他大
     * @Date 2019/11/4 8:27
     */
    private static int partition(int[] numbers, int start, int end) {
        Random random = new Random();
        int index = start + random.nextInt(end - start + 1);
        swap(numbers, index, end);
        int small = start;
        for (int i = start; i <= end; i++) {
            if (numbers[i] < numbers[end]) {
                swap(numbers, i, small);
                small++;
            }
        }
        swap(numbers, small, end);
        //返回中间值的索引
        return small;
    }

    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(moreThanHalfNum(array));

    }
}
