package 剑指offer.Q46_把数字翻译成字符串;

/**
 * Solution:递归方式有重复，可以自底向上，消除重复子问题
 * solution demo address:https://github.com/haiyusun/coding-interviews/blob/master/notes/%E5%89%91%E6%8C%87offer%E9%9D%A2%E8%AF%95%E9%A2%9846--%E6%8A%8A%E6%95%B0%E5%AD%97%E7%BF%BB%E8%AF%91%E6%88%90%E5%AD%97%E7%AC%A6%E4%B8%B2.md
 *
 * @Author XvYanpeng
 * @Date 2019/12/31 10:28
 */
public class Solution {
    public int getTranslateCount(int n) {
        if (n < 0) {
            return 0;
        }
        return count(String.valueOf(n));
    }

    private int count(String num) {
        int len = num.length();
        int[] counts = new int[len];
        // f(n -1)必然为1
        counts[len - 1] = 1;

        for (int i = len - 2; i >= 0; i--) {
            int high = num.charAt(i) - '0';

            int low = num.charAt(i + 1) - '0';
            int combineNum = high * 10 + low;
            if (combineNum >= 10 && combineNum <= 25) {
                // f(i) = f(i+1) +f(i+2),if中因为f(i+2)不存在，但是该值肯定为1
                if (i == len - 2) {
                    counts[i] = counts[i + 1] + 1;
                } else {
                    counts[i] = counts[i + 1] + counts[i + 2];
                }
            } else {
                // f(i) = f(i+1)
                counts[i] = counts[i + 1];
            }

        }
        // 从第一个数字开始的不同翻译数目
        return counts[0];
    }


    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.getTranslateCount(12258));
    }
}
