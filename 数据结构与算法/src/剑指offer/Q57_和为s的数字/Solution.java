package 剑指offer.Q57_和为s的数字;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/19 11:05
 */
public class Solution {
    public static boolean findNumberWithSum(int[] array, int sum) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] < sum) {
                left++;
            }
            if (array[left] + array[right] > sum) {
                right--;
            }
            if (array[left] + array[right] == sum) {
                System.out.println(array[left]);
                System.out.println(array[right]);
                return true;
            }
        }
        return false;
    }

    public static void findContinuousSequence(int sum) {
        int left = 1;
        int right = 2;
        int temp = 0;
        while (right < sum) {
            for (int i = left; i <= right; i++) {
                temp += i;
            }
            if (temp < sum) {
                right++;
            }
            if (temp > sum) {
                left++;
            }
            if (temp == sum) {
                for (int i = left; i <= right; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                left++;
            }
            temp = 0;
        }

    }

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 7, 11, 15};
        //   findNumberWithSum(array, 15);
        findContinuousSequence(15);

    }
}
