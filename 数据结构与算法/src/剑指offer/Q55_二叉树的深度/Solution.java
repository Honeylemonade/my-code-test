package 剑指offer.Q55_二叉树的深度;

/**
 * Solution:递归的方式，每一个递归都向上一层返回从他开始的深度
 *
 * @Author XvYanpeng
 * @Date 2020/3/18 11:42
 */
public class Solution {
    /**
     * 获取树的深度
     *
     * @param node
     * @return
     */
    public static int treeDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = treeDepth(node.left);
        int rightDepth = treeDepth(node.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    /**
     * 判断一个树是否是平衡二叉树
     * 如果返回值为-1，则代表不是
     * 返回值为>0的正数则表示是
     *
     * @param node
     * @return
     */
    public static int isBalance(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = treeDepth(node.left);
        int rightDepth = treeDepth(node.right);
        if (leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        } else {
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();
        n1.value = 1;
        n2.value = 2;
        n3.value = 3;
        n4.value = 4;
        n5.value = 5;
        n6.value = 6;
        n7.value = 7;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n5.left = n7;
        n3.right = n6;
        System.out.println(treeDepth(n1));
        System.out.println(isBalance(n1));
    }
}
