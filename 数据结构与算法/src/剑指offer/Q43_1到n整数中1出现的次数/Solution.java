package 剑指offer.Q43_1到n整数中1出现的次数;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2019/11/7 17:40
 */
public class Solution {
    public static int numberOf1Between1AndN_Solution(int n) {
        if (n <= 0) {
            return 0;
        }
        int count = 0;
        for (long i = 1; i <= n; i *= 10) {
            long diviver = i * 10;
            count += (n / diviver) * i + Math.min(Math.max(n % diviver - i + 1, 0), i);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOf1Between1AndN_Solution(13));
    }
}
