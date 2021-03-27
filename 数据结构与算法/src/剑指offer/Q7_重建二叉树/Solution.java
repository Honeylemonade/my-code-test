package 剑指offer.Q7_重建二叉树;

import java.util.Arrays;

/**
 * Solution:根据前序遍历和中序遍历顺序，得出二叉树
 * 使用递归的思想
 *
 * @author XvYanPeng
 * @date 2019/9/2 21:23
 */
public class Solution {
    /**
     * 二叉树结点类
     */
    public class TreeNode {
        int data;
        TreeNode leftNode;
        TreeNode rightNode;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        //如果序列为空，则返回空
        if (in.length == 0 && pre.length == 0) {
            return null;
        } else {
            TreeNode tempRoot = new TreeNode();
            int indexOfRootInIn = indexOf(in, pre[0]);
            tempRoot.data = pre[0];
            tempRoot.leftNode = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, indexOfRootInIn + 1), Arrays.copyOfRange(in, 0, indexOfRootInIn));
            tempRoot.rightNode = reConstructBinaryTree(Arrays.copyOfRange(pre, indexOfRootInIn + 1, pre.length), Arrays.copyOfRange(in, indexOfRootInIn + 1, pre.length));
            return tempRoot;
        }
    }

    /**
     * @return int
     * @description 用于获取数组中的某个元素的索引
     * @params [array, value]
     * @date 2019/9/3
     */
    public int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        Solution solution = new Solution();
        TreeNode treeNode = solution.reConstructBinaryTree(pre, in);
        System.out.println(treeNode);
    }
}
