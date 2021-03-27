package 剑指offer.Q62_圆圈中最后剩下的数字;

/**
 * Solution:约瑟夫环问题，可以用数学方法解决
 *
 * @Author XvYanpeng
 * @Date 2020/3/21 9:06
 */
public class Solution {
    public static int lastRemaining(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m) % i;

        }
        return last;
    }

    public static void main(String[] args) {

        System.out.println(lastRemaining(2, 1));
    }
}
