package 排序.归并排序;

/**
 * Solution:归并排序,利用分治的思想
 *
 * @Author XvYanpeng
 * @Date 2020/3/17 17:50
 */
public class Solution {
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
        //一定要mid+1不然bug(划分区域不同会结果不同,因为/除法靠前造成前一段长度为0)
        int q = mid + 1;
        int index = 0;
        while (p <= mid && q <= height) {
            if (a[p] > a[q]) {
                nums[index++] = a[q++];
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
            System.out.println(i);
        }
    }
}
