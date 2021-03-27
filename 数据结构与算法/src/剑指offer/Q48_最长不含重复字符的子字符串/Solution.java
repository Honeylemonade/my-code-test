package 剑指offer.Q48_最长不含重复字符的子字符串;

import java.util.Arrays;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/16 12:33
 */
public class Solution {
    public static int longestSubstring(String str) {
        int maxLength = 0;
        int curLength = 0;
        //设置各个字母的初始出现位置，-1表示为未出现
        int[] position = new int[26];
        Arrays.fill(position, -1);
        for (int i = 0; i < str.length(); i++) {
            //如果该字母从没出现过
            if (position[str.charAt(i) - 97] == -1) {
                position[str.charAt(i) - 97] = i;
                curLength++;
                maxLength = Math.max(curLength, maxLength);
            } else {
                //出现过该字母
                //出现在当前字串之外
                if (i - position[str.charAt(i) - 97] >= curLength) {
                    position[str.charAt(i) - 97] = i;
                    maxLength = Math.max(curLength, maxLength);
                } else {
                    //出现在当前字串之内
                    curLength = i - position[str.charAt(i) - 97];
                    position[str.charAt(i) - 97] = i;
                    maxLength = Math.max(curLength, maxLength);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "arabcacfr";
        System.out.println(longestSubstring(str));
    }
}
