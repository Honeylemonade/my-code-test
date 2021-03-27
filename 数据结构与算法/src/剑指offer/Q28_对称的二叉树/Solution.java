package 剑指offer.Q28_对称的二叉树;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/19 8:55
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

    boolean isSymmetrical(BinaryTreeNode pRoot) {
        StringBuffer sequence1 = new StringBuffer("");
        StringBuffer sequence2 = new StringBuffer("");
        //得到先序遍历序列
        getSequence1(sequence1, pRoot);
        getSequence2(sequence2, pRoot);
        if (sequence1.toString().equals(sequence2.toString())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return void
     * @description 得到先序遍历序列
     * @params [str, pRoot]
     * @date 2019/10/19
     */
    public void getSequence1(StringBuffer str, BinaryTreeNode pRoot) {
        if (pRoot != null) {
            str.append(pRoot.value);
            getSequence1(str, pRoot.pleft);
            getSequence1(str, pRoot.pright);
        } else {
            str.append("*");
        }
    }

    /**
     * @return void
     * @description 得到自定义遍历序列
     * @params [str, pRoot]
     * @date 2019/10/19
     */
    public void getSequence2(StringBuffer str, BinaryTreeNode pRoot) {
        if (pRoot != null) {
            str.append(pRoot.value);
            getSequence2(str, pRoot.pright);
            getSequence2(str, pRoot.pleft);
        } else {
            str.append("*");
        }
    }


    public static void main(String[] args) {
        //构建树
        BinaryTreeNode a = new BinaryTreeNode(7);
        BinaryTreeNode b = new BinaryTreeNode(7);
        BinaryTreeNode c = new BinaryTreeNode(7);
        BinaryTreeNode d = new BinaryTreeNode(7);
        BinaryTreeNode e = new BinaryTreeNode(7);
        BinaryTreeNode f = new BinaryTreeNode(7);
        BinaryTreeNode g = new BinaryTreeNode(5);
        a.pleft = b;
        a.pright = c;
        b.pleft = d;
        b.pright = e;
        c.pleft = f;
        System.out.println(new Solution().isSymmetrical(a));
    }
}
