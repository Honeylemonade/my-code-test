package 剑指offer.Q45_把数组排成最小的数;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Solution:常规思路是全排列，找最小，
 * 但是有更快的方法：先排序，再两两比较拼接
 *
 * @Author XvYanpeng
 * @Date 2019/11/18 16:16
 */
public class Solution {
    public String printMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        int len = numbers.length;
        String[] str = new String[len];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });
        for (int i = 0; i < len; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] array = {3, 32, 321};
        System.out.println(new Solution().printMinNumber(array));
    }
}
