package 剑指offer.Q3_数组中重复的数字;

import java.util.ArrayList;

/**
 * Type:仍存在问题，重复的数字，多次打印
 *
 * @author XvYanPeng
 * @date 2019/8/28 19:51
 */
public class Type1 {

    public static boolean duplicate(int[] array) throws Exception {
        //检验输入数据合法性
        if (array == null) {
            throw new Exception("数组为空");
        }
        for (int number : array) {
            if (number > array.length - 1) {
                throw new Exception("数组为空");
            }
        }
        //core algorithm
        int temp;
        for (int i = 0; i < array.length; i++) {
            while (array[i] != i) {
                if (array[i] == array[array[i]]) {
                    System.out.println(array[i]);
                    return true;
                }
                temp = array[array[i]];
                array[array[i]] = array[i];
                array[i] = temp;
            }
        }

        return false;
    }

    public static int getDuplication(int[] numbers) throws Exception {
        //检验输入数据合法性
        if (numbers == null) {
            throw new Exception("数组为空");
        }
        for (int number : numbers) {
            if (number > numbers.length - 1) {
                throw new Exception("数组为空");
            }
        }
        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;
        while (true) {
            if (countRange(numbers, left, mid) > (mid - left + 1)) {
                right = mid;
                mid = (left + right) / 2;
            } else {
                left = mid;
                mid = (left + right) / 2;
            }
            if (numbers[left] == numbers[right]) {
                return numbers[left];
            }
        }
    }

    public static int countRange(int[] numbers, int start, int end) {
        int count = 0;
        for (int number : numbers) {
            if (number >= start && number <= end) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        int[] array = {2, 3, 3, 0, 2, 5, 1};
        duplicate(array);
        System.out.println(getDuplication(array));
    }
}
