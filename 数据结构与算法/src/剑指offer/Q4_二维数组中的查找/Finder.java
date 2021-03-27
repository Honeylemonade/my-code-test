package 剑指offer.Q4_二维数组中的查找;

/**
 * Finder:
 *
 * @author XvYanPeng
 * @date 2019/8/30 11:42
 */
public class Finder {
    public static boolean find(int[][] array, int element) {
        int x = 0;
        int y = array[0].length - 1;
        while (x < array.length && y >= 0) {
            if (array[x][y] == element) {
                return true;
            } else if (element > array[x][y]) {
                x++;
            } else {
                y--;
            }
        }
        return false;
    }

    public static boolean find2(int[][] array, int element) throws Exception {
        //检验输入数据
        if (array == null) {
            throw new Exception("数组为空");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                throw new Exception("数组不符合规则");
            }
        }
        int i = 0;
        int j = array[0].length - 1;
        int temp = 0;
        while (i < array.length && j >= 0) {
            temp = array[i][j];
            if (element < temp) {
                j--;
            }
            if (element > temp) {
                i++;
            }
            if (element == temp) {
                System.out.println("(" + i + "," + j + ")");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        int[][] array = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}};

        System.out.println(find2(array, 2));
    }
}
