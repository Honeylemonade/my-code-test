package 剑指offer.Q49_丑数;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/16 13:20
 */
public class Solution {
    public static int getUgly(int index) {
        int[] uglyNumber = new int[index];
        int[] m2 = new int[index];
        int[] m3 = new int[index];
        int[] m5 = new int[index];
        //初始化
        uglyNumber[0] = 1;
        m2[0] = 2;
        m3[0] = 3;
        m5[0] = 5;
        int pm2 = 0;
        int pm3 = 0;
        int pm5 = 0;
        int i = 0;
        while (i < index - 1) {

            while (m2[pm2] <= uglyNumber[i]) {
                pm2++;
                m2[pm2] = uglyNumber[pm2] * 2;

            }
            while (m3[pm3] <= uglyNumber[i]) {
                pm3++;
                m3[pm3] = uglyNumber[pm3] * 3;
            }
            while (m5[pm5] <= uglyNumber[i]) {
                pm5++;
                m5[pm5] = uglyNumber[pm5] * 5;
            }
            i++;
            uglyNumber[i] = Math.min(Math.min(m2[pm2], m3[pm3]), m5[pm5]);
        }
        return uglyNumber[i];
    }

    public static void main(String[] args) {
        System.out.println(getUgly(7));
    }
}
