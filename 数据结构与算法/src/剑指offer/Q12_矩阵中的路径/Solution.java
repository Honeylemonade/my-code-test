package 剑指offer.Q12_矩阵中的路径;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/9/23 20:14
 */
public class Solution {

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix.length != rows * cols || matrix.length < str.length) {
            return false;
        }
        boolean[] flags = new boolean[rows * cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (core(matrix, rows, cols, i, j, 0, str, flags)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean core(char[] matrix, int rows, int cols, int row, int col, int index, char[] str, boolean[] flags) {
        if (index >= str.length) {
            return true;
        }
        if (row >= rows || row < 0 || col >= cols || col < 0 || flags[row * cols + col] == true || str[index] != matrix[row * cols + col]) {
            return false;
        }
        flags[row * cols + col] = true;
        return (core(matrix, rows, cols, row + 1, col, index + 1, str, flags) ||
                core(matrix, rows, cols, row - 1, col, index + 1, str, flags) ||
                core(matrix, rows, cols, row, col + 1, index + 1, str, flags) ||
                core(matrix, rows, cols, row, col - 1, index + 1, str, flags));
    }


    public static void main(String[] args) {
        char[] array = new String("ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS").toCharArray();
        char[] target = new String("SGGFIECVAASABCEHJIGQEM").toCharArray();
        System.out.println(hasPath(array, 5, 8, target));
    }
}
