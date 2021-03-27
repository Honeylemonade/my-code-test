package 剑指offer.Q61_扑克牌中的顺子;

import java.util.Arrays;
import java.util.Collections;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/20 13:04
 */
public class Solution {
    /**
     * 0表示大小王，1-13表示从A到K
     *
     * @param numbers
     * @return
     */
    public static boolean isContinuous(int[] numbers) {
        //先排序
        Arrays.sort(numbers);
        //获取最小非0和最大值
        int left = 0;
        int right = numbers[4];
        int zeroCount = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] != 0) {
                left = numbers[i];
                break;
            } else {
                zeroCount++;
            }
        }
        //判断缺几个0
        int need = 5 - (right - left);
        //是否足够补充
        if (zeroCount >= need) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int[] a = {0, 1, 3, 4, 5};
        System.out.println(isContinuous(a));
    }
}
