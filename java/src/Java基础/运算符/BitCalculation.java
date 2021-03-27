package Java基础.运算符;

import java.util.Collections;

/**
 * BitCalculation:位运算
 * &，|，~，^：按顺序分别是与，或，非，异或
 *
 * @Author XvYanpeng
 * @Date 2020/3/19 21:36
 */
public class BitCalculation {
    /**
     * 首先要了解，计算机中的数字存储的形式为“补码”，并且int类型站4个字节，即32位
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(2 & 2);
        System.out.println(2 | 2);
        /**
         * ~2=-3（涉及到补码和原码的转换）
         */
        System.out.println(~2);
        System.out.println(~3);
        System.out.println(~4);
        System.out.println(2 ^ 2);
    }
}
