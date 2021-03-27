package 剑指offer.Q44_数字序列中某一位的数字;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2019/11/8 18:47
 */
public class Solution {
    public static int getNumberByIndex(int index) {
        int set = 1;
        while (index > 0) {
            index -= set * getCountBySet(set);
            set++;
        }
        set--;
        index += set * getCountBySet(set);
        int circle = index / set;
        int main = index % set;
        if (set == 0) {
            return circle;
        } else {
            int theNumber = (int) (circle + Math.pow(10, set - 1));
            String temp = String.valueOf(theNumber);
            return Integer.valueOf(String.valueOf(temp.charAt(main)));
        }
    }

    public static int getCountBySet(int set) {
        if (set == 1) {
            return 10;
        } else {
            return (int) (Math.pow(10, set) - Math.pow(10, set - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(getNumberByIndex(1001));
    }
}
