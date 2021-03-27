package 剑指offer.Q16_数值的整数次方;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/8 21:03
 */
public class Solution {
    public static double Power(double base, int exponent) {
        if (base == 0) {
            return 0;
        } else {
            if (exponent == 0) {
                return 1;
            }
            double result = 1;
            if (exponent < 0) {
                for (int i = 0; i < -exponent; i++) {
                    result *= base;
                }
                return 1 / result;
            }
            if (exponent > 0) {
                for (int i = 0; i < exponent; i++) {
                    result *= base;
                }
                return result;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Power(2, -3));
    }
}
