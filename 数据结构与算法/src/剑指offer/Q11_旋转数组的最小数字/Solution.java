package 剑指offer.Q11_旋转数组的最小数字;

/**
 * Solution:
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * @author XvYanPeng
 * @date 2019/9/22 22:14
 */
public class Solution {
    public static int getMinNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            int front = 0;
            int rear = array.length - 1;
            int middle;
            //正序，直接返回首位
            if (array[0] < array[rear]) {
                return array[0];
            } else {
                while (rear - front != 1) {
                    middle = (front + rear) / 2;
                    if (array[middle] == array[front]) {
                        return selectMinItemInOrder(array);
                    } else if (array[middle] > array[front]) {
                        front = middle;
                    } else {
                        rear = middle;
                    }
                }
            }
            return Math.min(array[front], array[rear]);
        }
    }

    public static int selectMinItemInOrder(int[] array) {
        int minNum = array[0];
        for (int num : array) {
            if (minNum > num) {
                minNum = num;
            }
        }
        return minNum;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1, 1};
        System.out.println(getMinNumberInRotateArray(array));
    }
}
