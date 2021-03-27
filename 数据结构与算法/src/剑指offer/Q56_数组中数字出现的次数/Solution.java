package 剑指offer.Q56_数组中数字出现的次数;

import java.util.ArrayList;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/19 9:53
 */
public class Solution {
    /**
     * 题目一：
     *
     * @param array
     */
    public static void findNumsAppearOnce(int[] array) {
        int result = array[0];
        int resultA = 0;
        int resultB = 0;
        for (int i = 1; i < array.length; i++) {
            result ^= array[i];
        }
        int index1 = indexOf1(result);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int e : array) {
            if (isBit1(e, index1)) {
                a.add(e);
            } else {
                b.add(e);
            }
        }
        //分别判断两组中的单独出现的数字
        for (int aElem : a) {
            resultA ^= aElem;
        }
        System.out.print("题目一：" + resultA + " ");
        for (int bElem : b) {
            resultB ^= bElem;
        }
        System.out.println(resultB);
    }

    /**
     * 判断一个数的二进制从最右边开始第几位是1
     *
     * @param num
     * @return
     */
    public static int indexOf1(int num) {
        int index = 1;
        while ((num & 1) == 0 && index < Integer.SIZE) {
            index++;
            num = num >> 1;
        }
        return index;
    }

    public static boolean isBit1(int num, int indexBit) {
        num = num >> indexBit - 1;
        if ((num & 1) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 题目二：
     *
     * @param array
     */
    public static void findNumberAppearOnce(int[] array) {
        //数组中所有数的位相加，存储在数组中
        int[] temp = new int[32];
        for (int e : array) {
            for (int i = 1; i <= 32; i++) {
                if (isBit1(e, i)) {
                    temp[i - 1]++;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((temp[i] % 3) != 0) {
                result += Math.pow(2, i);
            }
        }
        System.out.println("题目二：唯一的数字为" + result);
    }


    public static void main(String[] args) {
        int[] array = {2, 4, 3, 6, 3, 2, 5, 5};
        findNumsAppearOnce(array);
        int[] array2 = {2, 2, 3, 2};
        findNumberAppearOnce(array2);
    }
}
