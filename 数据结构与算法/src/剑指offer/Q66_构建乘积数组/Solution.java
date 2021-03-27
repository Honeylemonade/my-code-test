package 剑指offer.Q66_构建乘积数组;

import java.util.Arrays;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/22 9:13
 */
public class Solution {
    public static int[] multiply(int[] a) {
        int[] b = new int[a.length];
        int[] c = new int[a.length];
        int[] d = new int[a.length];
        int temp = 1;
        Arrays.fill(c, 1);
        Arrays.fill(d, 1);
        for (int i = 1; i < c.length; i++) {
            temp *= a[i - 1];
            c[i] = temp;
        }
        temp = 1;
        for (int i = a.length - 2; i > -1; i--) {
            temp *= a[i + 1];
            d[i] = temp;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = c[i] * d[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(multiply(a));
    }
}
