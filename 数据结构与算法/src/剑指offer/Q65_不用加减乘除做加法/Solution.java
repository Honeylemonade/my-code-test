package 剑指offer.Q65_不用加减乘除做加法;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/21 11:29
 */
public class Solution {
    public static int add(int num1, int num2) {
        int sum;
        int carry = 1;

        while (carry != 0) {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(add(-1, 3));
    }
}
