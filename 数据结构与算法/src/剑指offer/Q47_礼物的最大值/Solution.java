package 剑指offer.Q47_礼物的最大值;

/**
 * Solution:利用动态规划解决问题，这种方法比递归好，去除了重复计算，仍有改进余地，=>用一维数组代替二维数组
 *
 * @Author XvYanpeng
 * @Date 2020/3/16 10:42
 */
public class Solution {
    //求第几行，第几列的最大值
    public static int solution1(int[][] values) {
        //验证输入的数据是否合法
        if (values == null || values.length <= 0 || values[0].length <= 0) {
            return 0;
        }
        //创建二维数组，用于存储最大值
        int[][] maxValues = new int[values.length][];
        for (int i = 0; i < values.length; i++) {
            maxValues[i] = new int[values[0].length];
        }
        //初始化二维数组
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                //填充数组中第i行，第j列的最大值；取左边与上边最大的值做和。
                int left = 0;
                int up = 0;
                if (j > 0) {
                    left = maxValues[i][j - 1];
                }
                if (i > 0) {
                    up = maxValues[i - 1][j];
                }
                maxValues[i][j] = Math.max(left, up) + values[i][j];
            }
        }
        //取得(i,j)最大值
        return maxValues[values.length - 1][values[0].length - 1];
    }

    public static void main(String[] args) {
        //m(i)行*n(j)列的数组
        int[][] values = {
                {1, 10, 3, 8},
                {12, 2, 9, 6},
                {5, 7, 4, 11},
                {3, 7, 16, 5}};
        System.out.println(solution1(values));
    }
}
