package 剑指offer.Q53_在排序数组中查找数字;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/18 9:33
 */
public class Solution {
    /**
     * 题目一：数字在排序数组中出现的次数
     *
     * @param
     */
    public static int getNumberOfKey(int[] array, int key) {
        int fistKeyIndex = getFirstKeyIndex(array, 0, array.length / 2, array.length - 1, key);
        int lastKeyIndex = getLastKeyIndex(array, 0, array.length / 2, array.length - 1, key);
        if (fistKeyIndex == -1 || lastKeyIndex == -1) {
            return 0;
        } else {
            return lastKeyIndex - fistKeyIndex + 1;
        }
    }

    public static int getFirstKeyIndex(int[] array, int left, int mid, int right, int key) {
        if (left == right) {
            if (array[left] != key) {
                return -1;
            } else {
                return left;
            }
        }
        //找后面
        if (array[mid] < key) {
            return getFirstKeyIndex(array, mid + 1, (right + mid) / 2, right, key);
        }
        //找前面
        if (array[mid] > key) {
            return getFirstKeyIndex(array, left, (left + mid) / 2, mid - 1, key);
        }
        if (array[mid] == key) {
            if (array[mid - 1] != key) {
                return mid;
            } else {
                return getFirstKeyIndex(array, left, (left + mid) / 2, mid - 1, key);
            }
        }
        return -1;
    }

    public static int getLastKeyIndex(int[] array, int left, int mid, int right, int key) {
        if (left == right) {
            if (array[right] != key) {
                return -1;
            } else {
                return right;
            }
        }
        //找后面
        if (array[mid] < key) {
            return getLastKeyIndex(array, mid + 1, (right + mid) / 2, right, key);
        }
        //找前面
        if (array[mid] > key) {
            return getLastKeyIndex(array, left, (left + mid) / 2, mid - 1, key);
        }
        if (array[mid] == key) {
            if (array[mid + 1] != key) {
                return mid;
            } else {
                return getLastKeyIndex(array, mid + 1, (right + mid) / 2, right, key);
            }
        }
        return -1;
    }

    /**
     * 题目二：0~n-1中缺失的数字
     *
     * @param
     */
    public static int getMissingNumber(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) / 2;
        while (true) {
            if (mid != array[mid]) {
                //向前找
                right = mid;
                mid = (left + right) / 2;
            } else {
                //向后找
                left = mid;
                mid = (left + right) / 2;

            }
            if (left == array[left] && left == mid && right != array[right]) {
                break;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 3, 3, 4, 5};
        int[] b = {0, 1, 2, 3, 5, 6, 7};
        System.out.println(getNumberOfKey(a, 1));
        System.out.println(getMissingNumber(b));
    }
}
