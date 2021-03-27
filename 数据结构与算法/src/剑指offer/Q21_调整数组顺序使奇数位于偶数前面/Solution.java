package 剑指offer.Q21_调整数组顺序使奇数位于偶数前面;

/**
 * Solution:利用两个指针，当指向对应奇数和偶数时，交换顺序
 *
 * @author XvYanPeng
 * @date 2019/10/13 8:00
 */
public class Solution {
    public void reOrderArray(int[] array) {
        int index1 = 0;
        int index2 = array.length - 1;
        int temp;
        while (index1 < index2 - 1) {
            //找到前面的偶数
            while ((array[index1] % 2) != 0) {
                index1++;
            }
            //找到后面的奇数
            while ((array[index2] % 2) != 1) {
                index2--;
            }
            temp = array[index2];
            array[index2] = array[index1];
            array[index1] = temp;
            index1++;
            index2--;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        new Solution().reOrderArray(array);
    }
}
