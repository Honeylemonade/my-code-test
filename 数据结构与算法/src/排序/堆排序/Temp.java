package 排序.堆排序;

/**
 * Temp:
 *
 * @Author XvYanpeng
 * @Date 2020/5/8 17:48
 */
public class Temp {
    private static void heapSort(int[] arr) {
        //用数组表示堆
        //构建大顶堆，直至index到1(最后一次不用换了)
        for (int i = arr.length - 1; i > 0; i--) {
            //构造大顶堆(从0到i)
            heapify(arr, i);
            //元素放在后面
            swap(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i) {
        for (int j = (i - 1) / 2; j >= 0; j--) {
            if (arr[2 * j + 1] > arr[j]) {
                swap(arr, j, 2 * j + 1);
            }
            //右节点不一定有没有,并且不一定是不是在范围内，要加附加条件
            if (2 * j + 2 <= i && arr[2 * j + 2] > arr[j]) {
                swap(arr, j, 2 * j + 2);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * @Author XvYanpeng
     * @Description 打印数组
     * @Date 2020/4/26 9:03
     */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {1, 9, 5, 6, 7};

        heapSort(arr);
        System.out.println("Sorted array is");
        printArray(arr);
    }
}
