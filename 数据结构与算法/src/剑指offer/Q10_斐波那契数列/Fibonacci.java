package 剑指offer.Q10_斐波那契数列;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Fibonacci:递归的应用，斐波那契数列
 *
 * @author XvYanPeng
 * @date 2019/9/6 12:48
 */
public class Fibonacci {
    private static HashMap<Integer, Integer> map = new HashMap<>();

    /**
     * @return int
     * @description 传统的方法，由过多的重复计算，并且复杂度以指数增长，效率很差
     * @params [num]
     * @date 2019/9/6
     */
    public static int getFibonacciByOldMethod(int num) {
        if (num <= 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return getFibonacciByOldMethod(num - 1) + getFibonacciByOldMethod(num - 2);
        }
    }

    /**
     * @return int
     * @description 利用HashMap存储已经计算过的斐波那契值
     * @params [num]
     * @date 2019/9/6
     */
    public static int getFibonacciByNewMethod(int num) {
        int tempNumber;
        if (num <= 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            if (map.get(num) != null) {
                return map.get(num);
            } else {
                tempNumber = getFibonacciByOldMethod(num - 1) + getFibonacciByOldMethod(num - 2);
                map.put(num, tempNumber);
                return tempNumber;
            }
        }
    }

    /**
     * @return int
     * @description 将递归转化为循环
     * @params [num]
     * @date 2019/9/6
     */
    public static int getFibonacciByLoop(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int temp;
            for (int i = 0; i < num - 1; i++) {
                temp = b;
                b = a + b;
                a = temp;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        Logger.getGlobal().info("start");
        System.out.println(getFibonacciByLoop(6));
        Logger.getGlobal().info("end");
    }
}
