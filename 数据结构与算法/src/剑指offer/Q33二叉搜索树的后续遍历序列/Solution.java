package 剑指offer.Q33二叉搜索树的后续遍历序列;

import java.util.Arrays;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/22 18:01
 */
public class Solution {
    public static boolean verifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        int rearElem = sequence[sequence.length - 1];
        int index = 0;
        while (sequence[index] < rearElem) {
            index++;
        }
        for (int i = index; i < sequence.length; i++) {
            if (sequence[i] < rearElem) {
                return false;
            }
        }
        int[] leftArray = Arrays.copyOfRange(sequence, 0, index);
        int[] rightArray = Arrays.copyOfRange(sequence, index, sequence.length - 1);
        boolean leftFlag = true;
        boolean rightFlag = true;
        if (leftArray.length != 0) {
            leftFlag = verifySquenceOfBST(leftArray);
        }
        if (rightArray.length != 0) {
            rightFlag = verifySquenceOfBST(rightArray);
        }
        return leftFlag && rightFlag;
    }

    public static void main(String[] args) {
        int[] sequence = {7, 6, 9, 11, 10, 8};
        System.out.println(verifySquenceOfBST(sequence));

    }
}
