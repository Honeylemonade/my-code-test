package 剑指offer.Q15_二进制中1的个数;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/8 12:34
 */
public class Solution {
    public static int numberOf1(int n) {
        int sum = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                sum++;
            }
            n = n >> 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numberOf1(-9));
    }
}
