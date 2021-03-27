package leetcode.动态规划;

import java.util.Map;

/**
 * Q_整数拆分:
 *
 * @Author XvYanpeng
 * @Date 2020/7/15 21:56
 */
public class Q343_整数拆分 {
    public static int integerBreak(int n) {
        //dp[n]表示拆分后乘积最大化的结果
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int max = 0;
            for (int j = 1; j < i; j++) {
                max = Math.max((Math.max(max, j * dp[i - j])), j * (i - j));
            }
            dp[i] = max;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(4));

    }
}
