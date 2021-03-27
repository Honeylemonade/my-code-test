package 剑指offer.Q50_第一个只出现一次的字符;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/17 14:13
 */
public class Solution {
    public static char getFirstNotRepeatingChar(String str) {
        //由于扫描的为英文字符串，所以可构建长度为26的数组
        int[] array = new int[26];
        //第一次遍历计算各个字符的出现次数
        for (int i = 0; i < str.length(); i++) {
            array[str.charAt(i) - 97]++;
        }
        //第二次取得第一个出现次数为1的
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                return Character.toChars(97 + i)[0];
            }
        }
        return '*';
    }

    public static void main(String[] args) {
        System.out.println(getFirstNotRepeatingChar("aabsjdkajsbdkjqw"));
    }
}
