package 剑指offer.Q13_机器人的运动范围;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/6 20:58
 */
public class Solution {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] flags = new boolean[rows][cols];
        return movingCountCore(threshold, rows, cols, 0, 0, flags);
    }

    public int movingCountCore(int threshold, int rows, int cols, int i, int j, boolean[][] flags) {
        if (check(threshold, rows, cols, i, j, flags)) {
            flags[i][j] = true;
            return 1 + movingCountCore(threshold, rows, cols, i + 1, j, flags)
                    + movingCountCore(threshold, rows, cols, i - 1, j, flags)
                    + movingCountCore(threshold, rows, cols, i, j + 1, flags)
                    + movingCountCore(threshold, rows, cols, i, j - 1, flags);
        } else {
            return 0;
        }
    }

    //判断了某个坐标是否应该出现在运动范围中
    public boolean check(int threshold, int rows, int cols, int i, int j, boolean[][] flags) {
        int sum = 0;
        int a = i;
        int b = j;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        while (b > 0) {
            sum += b % 10;
            b /= 10;
        }
        return i < rows && i >= 0 && j < cols && j >= 0 && flags[i][j] == false && sum <= threshold;
    }

    public static void main(String[] args) {
        Solution solutiont = new Solution();
        System.out.println(solutiont.movingCount(5, 10, 10));
    }
}
