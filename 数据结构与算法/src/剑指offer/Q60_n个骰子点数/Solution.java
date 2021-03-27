package 剑指offer.Q60_n个骰子点数;

import java.util.Arrays;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/20 12:25
 */
public class Solution {
    public static void printProbability(int number) {
        if (number <= 0) {
            return;
        }
        int result[][] = new int[2][6 * number + 1];
        for (int i = 1; i <= 6; i++) {
            result[1][i] = 1;
        }
        for (int num = 2; num <= number; num++) {
            for (int i = num; i < 6 * num + 1; i++) {
                for (int j = i - 6; j < i; j++) {
                    if (j > 0) {
                        result[num % 2][i] += result[(num - 1) % 2][j];
                    }
                }
            }
        }
        double sum = 0;
        for (int i = number; i < 6 * number + 1; i++) {
            sum += result[number % 2][i];
        }
        System.out.println("number = " + number);
        for (int i = number; i < 6 * number + 1; i++) {
            System.out.println("probability " + i + ":" + result[number % 2][i] / sum);
        }
    }

    public static void main(String[] args) {
        printProbability(2);
    }
}
