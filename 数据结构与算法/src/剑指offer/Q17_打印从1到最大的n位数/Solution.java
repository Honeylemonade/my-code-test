package 剑指offer.Q17_打印从1到最大的n位数;

/**
 * Solution:利用了递归来实现，想象成记分牌
 *
 * @author XvYanPeng
 * @date 2019/10/8 21:19
 */
public class Solution {
    public static void print1ToMaxOfNDigits(int n) {
        if (n < 1) {
            return;
        } else {
            int[] array = new int[n];
            printer(0, array);
        }
    }

    public static void printer(int index, int[] array) {
        if (index == array.length - 1) {
            for (int i = 0; i < 10; i++) {
                array[index] = i;
                arrayPrinter(array);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                array[index] = i;
                printer(index + 1, array);
            }
        }
    }

    public static void arrayPrinter(int[] array) {
        String str = "";
        int index = 0;
        for (int num : array) {
            str += num;
        }
        System.out.println(str.replaceAll("^(0+)", ""));
    }

    public static void main(String[] args) {
        print1ToMaxOfNDigits(3);
    }
}
