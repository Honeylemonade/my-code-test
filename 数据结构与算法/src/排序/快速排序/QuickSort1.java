package 排序.快速排序;


import java.util.*;

/**
 * QuickSort2:
 *
 * @Author XvYanpeng
 * @Date 2020/4/1 20:16
 */
public class QuickSort1 {
    /**
     * 递归
     */
    public static void quickSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = partition(a, low, high);
        quickSort(a, low, pivot - 1);
        quickSort(a, pivot + 1, high);
    }


    /**
     * 排序一个数并返回某个数的正确位置
     */
    private static int partition(int[] a, int low, int high) {
        Random random = new Random();
        int pivotIndex = random.nextInt(high - low + 1) + low;
        int pivotValue = a[pivotIndex];
        swap(a, pivotIndex, high);
        int savedPosition = high;
        high--;
        while (low <= high) {
            if (a[low] > pivotValue) {
                swap(a, low, high);
                high--;
            } else {
                low++;
            }
        }
        swap(a, low, savedPosition);
        return low;
    }

    private static void swap(int[] a, int pivotIndex, int high) {
        int temp = a[pivotIndex];
        a[pivotIndex] = a[high];
        a[high] = temp;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 8, 7};
        quickSort(a, 0, a.length - 1);
        for (int num : a) {
            System.out.println(num);
        }
    }
}

