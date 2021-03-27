package 剑指offer.Q40_最小k个数;

import java.util.ArrayList;
import java.util.Random;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2019/11/4 10:10
 */
public class Solution {
    public static ArrayList<Integer> getLeastNumbers(int[] array, int k) {
        ArrayList<Integer> arrayList = new ArrayList();
        if (k < 1 || k > array.length) {
            return arrayList;
        }
        if (array.length == k) {
            for (int i = 0; i < k; i++) {
                arrayList.add(array[i]);
            }
            return arrayList;
        }
        int start = 0;
        int end = array.length - 1;
        int index = partition(array, 0, array.length - 1);
        while (index != k) {
            if (index < k) {
                start = index + 1;
                index = partition(array, start, end);
            } else {
                end = index - 1;
                index = partition(array, start, end);
            }
        }
        for (int i = 0; i < k; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;

    }

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
        int[] array = {4, 5, 1, 6, 2, 7, 3, 8};
        ArrayList<Integer> arrayList = getLeastNumbers(array, 4);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
