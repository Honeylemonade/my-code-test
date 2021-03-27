package 剑指offer.Q20_表示数值的字符串;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/12 15:39
 */
public class Solution {

    public boolean isNumeric(char[] str) {
        //进行基本检查
        //1，只能由四种部分组成：数字，点，e/E，+/-(遍历时判断)
        //2，不能为null
        //3，长度不能为0
        if (str == null || str.length == 0) {
            return false;
        }
        //e/E的个数
        int eCount = 0;
        //+/-的数量
        int asCount = 0;
        //.的数量
        int dotCount = 0;
        int index = 0;
        //索引最大边界
        final int MAXINDEX = str.length - 1;
        while (index < MAXINDEX) {
            //如果是数字
            if (48 <= str[index] && str[index] <= 57) {
                if (str[index + 1] == 43 || str[index + 1] == 45) {
                    return false;
                } else {
                    index++;
                }
            } else if (str[index] == '.') {
                //如果是点
                if (str[index + 1] < 48 || str[index + 1] > 57 || eCount > 0 || dotCount > 0) {
                    return false;
                } else {
                    index++;
                    dotCount++;
                }
            } else if (str[index] == 69 || str[index] == 101) {
                //如果是e/E
                if (index == 0 || eCount > 1) {
                    return false;
                } else {
                    index++;
                    eCount++;
                }

            } else if (str[index] == 43 || str[index] == 45) {
                //如果是+/-
                if (str[index + 1] == 101 || str[index + 1] == 69 || str[index + 1] == 43 || str[index + 1] == 45 || asCount > eCount + 1) {
                    return false;
                } else {
                    index++;
                    asCount++;
                }
            } else {
                //如果都不是
                return false;
            }
        }
        //到达末尾，判断是否是不能在末尾的符号
        if (48 <= str[index] && str[index] <= 57) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "1.2.3";
        char[] chars = str.toCharArray();
        System.out.println(new Solution().isNumeric(chars));
    }
}
