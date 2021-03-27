package 剑指offer.Q27_二叉树的镜像;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/19 8:42
 */
public class Solution {
    public static class BinaryTreeNode {
        public BinaryTreeNode(int value) {
            this.value = value;
        }

        int value;
        BinaryTreeNode pleft;
        BinaryTreeNode pright;
    }

    public void Mirror(BinaryTreeNode root) {
        if (root != null) {
            BinaryTreeNode temp = root.pleft;
            root.pleft = root.pright;
            root.pright = temp;
            Mirror(root.pleft);
            Mirror(root.pright);
        }
    }

    public static void main(String[] args) {
        //构建树
        BinaryTreeNode a = new BinaryTreeNode(8);
        BinaryTreeNode b = new BinaryTreeNode(6);
        BinaryTreeNode c = new BinaryTreeNode(10);
        BinaryTreeNode d = new BinaryTreeNode(5);
        BinaryTreeNode e = new BinaryTreeNode(7);
        BinaryTreeNode f = new BinaryTreeNode(9);
        BinaryTreeNode g = new BinaryTreeNode(11);
        a.pleft = b;
        a.pright = c;
        b.pleft = d;
        b.pright = e;
        c.pleft = f;
        c.pright = g;
        new Solution().Mirror(a);
        BinaryTreeNode binaryTreeNode = a;
    }
}
