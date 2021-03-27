package 剑指offer.Q51_数组中的逆序对;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/17 14:29
 */
public class Solution {
    //符合条件的个数
    public static int count = 0;

    public static void mergeSort(int[] a, int low, int height) {
        //如果剩余一个元素，无需排序，直接返回
        if (low == height) {
            return;
        } else {
            int mid = (low + height) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, height);
            merge(a, low, mid, height);
        }

    }

    private static void merge(int[] a, int low, int mid, int height) {
        int[] nums = new int[height - low + 1];
        int p = low;
        int q = mid + 1;
        int index = 0;
        while (p <= mid && q <= height) {
            if (a[p] > a[q]) {
                nums[index++] = a[q++];
                count += mid - p + 1;
            } else {
                nums[index++] = a[p++];
            }
        }
        while (p <= mid) {
            nums[index++] = a[p++];
        }
        while (q <= height) {
            nums[index++] = a[q++];
        }
        System.arraycopy(nums, 0, a, low, height - low + 1);
    }

    public static void main(String[] args) {
        int[] array = {8, 7, 9, 2, 3, 1};
        mergeSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n符合的数量为：" + count);
    }
}
