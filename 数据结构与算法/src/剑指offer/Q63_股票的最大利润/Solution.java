package 剑指offer.Q63_股票的最大利润;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/21 10:57
 */
public class Solution {
    public static int maxdiff(int[] array) {
        if (array.length < 2) {
            return -1;
        }
        int tempMin = array[0];
        int maxDiff = 0;
        for (int i : array) {
            if (i < tempMin) {
                tempMin = i;
            }
            if ((i - tempMin) > maxDiff) {
                maxDiff = i - tempMin;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] array = {9, 11, 8, 5, 7, 12, 16, 14};
        System.out.println(maxdiff(array));

    }
}
