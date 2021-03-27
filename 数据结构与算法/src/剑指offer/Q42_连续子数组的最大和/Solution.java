package 剑指offer.Q42_连续子数组的最大和;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 10:23
 */
public class Solution {
    public static int findGreatestSumOfSubArray(int[] array) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            //遇到前置和小于0
            if (array[i] > temp && temp < 0) {
                max = array[i];
                temp = array[i];
            } else {

                if (temp + array[i] > max) {
                    //加当前数变大
                    temp += array[i];
                    if (temp > max) {
                        max = temp;
                    }
                } else {
                    //加当前数变小
                    temp += array[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(findGreatestSumOfSubArray(array));
    }
}
