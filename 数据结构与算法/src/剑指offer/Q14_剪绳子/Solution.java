package 剑指offer.Q14_剪绳子;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/7 21:00
 */
public class Solution {

    /**
     * @return int
     * @description 动态规划的方法
     * @params [length]
     * @date 2019/10/7
     */
    public static int maxResult(int target) {
        if (target < 2) {
            return 1;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        int[] products = new int[target + 1];
        products[1] = 1;
        products[2] = 1;
        products[3] = 2;
        for (int i = 4; i <= target; i++) {
            int max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int temp = products[j] * products[i - j];
                if (temp > max) {
                    max = temp;
                }
            }
            products[i] = max;
        }
        return products[target];
    }

    public static void main(String[] args) {
        System.out.println(maxResult(4));
    }
}
