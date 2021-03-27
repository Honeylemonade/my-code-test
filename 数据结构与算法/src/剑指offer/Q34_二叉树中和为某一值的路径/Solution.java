package 剑指offer.Q34_二叉树中和为某一值的路径;

import java.util.ArrayList;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/24 19:28
 */
public class Solution {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        //定义结果集变量
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return resultList;
        }
        //存储临时路径
        ArrayList<Integer> temp = new ArrayList<Integer>();
        core(resultList, temp, root, target, 0);
        return resultList;
    }

    public void core(ArrayList<ArrayList<Integer>> resultList, ArrayList<Integer> temp, TreeNode node, int target, int sum) {
        if (node.left == null && node.right == null) {
            sum += node.val;
            temp.add(node.val);
            if (sum == target) {
                //注意要传递拷贝，结果集的多个结果对象会指向同一个temp
                resultList.add((ArrayList<Integer>) temp.clone());
            }
        } else {
            sum += node.val;
            temp.add(node.val);
            if (node.left != null) {
                core(resultList, temp, node.left, target, sum);
                temp.remove(temp.size() - 1);
            }
            if (node.right != null) {
                core(resultList, temp, node.right, target, sum);
                temp.remove(temp.size() - 1);
            }

        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(12);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        for (ArrayList<Integer> arrayList : new Solution().findPath(a, 22)) {
            System.out.println(arrayList.toString());
        }
    }
}
