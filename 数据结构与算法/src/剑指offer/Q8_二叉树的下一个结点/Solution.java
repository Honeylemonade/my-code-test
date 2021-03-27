package 剑指offer.Q8_二叉树的下一个结点;

/**
 * NextTreeNode:
 * 分情况考虑：
 * 一：有右子树
 * 二：无右子树：
 * ** 1，结点是父节点的左子树
 * ** 2，结点时父节点的右子树
 *
 * @author XvYanPeng
 * @date 2019/9/5 10:46
 */
public class Solution {
    class TreeNode {
        String data;
        TreeNode leftNode;
        TreeNode rightNode;
        TreeNode parentNode;

        public TreeNode(String data) {
            this.data = data;
        }
    }

    public TreeNode getNext(TreeNode treeNode) {
        //如果右子树不为空，则下一个结点就是右子树的最左结点
        if (treeNode.rightNode != null) {
            TreeNode tempNode = treeNode.rightNode;
            while (tempNode.leftNode != null) {
                tempNode = tempNode.leftNode;
            }
            return tempNode;
        } else {
            //如果右子树为空,并且他是父节点的左子树
            if (treeNode.parentNode.leftNode == treeNode) {
                return treeNode.parentNode;
            } else {
                //如果右子树为空,并且他是父节点的右子树
                TreeNode tempNode = treeNode;
                while (tempNode.parentNode != null && tempNode.parentNode.leftNode != tempNode) {
                    tempNode = tempNode.parentNode;
                }
                return tempNode.parentNode;
            }
        }
    }

    /**
     * @return Q8_二叉树的下一个结点.Solution.TreeNode
     * @description 返回二叉树的指定结点
     * @params []
     * @date 2019/9/5
     */
    public TreeNode generateTree() {
        //生成示例的二叉树
        TreeNode a = new TreeNode("a");
        TreeNode b = new TreeNode("b");
        TreeNode c = new TreeNode("c");
        TreeNode d = new TreeNode("d");
        TreeNode e = new TreeNode("e");
        TreeNode f = new TreeNode("f");
        TreeNode g = new TreeNode("g");
        TreeNode h = new TreeNode("h");
        TreeNode i = new TreeNode("i");
        a.leftNode = b;
        a.rightNode = c;
        b.leftNode = d;
        b.rightNode = e;
        b.parentNode = a;
        c.leftNode = f;
        c.rightNode = g;
        c.parentNode = a;
        d.parentNode = b;
        e.parentNode = b;
        e.leftNode = h;
        e.rightNode = i;
        f.parentNode = c;
        g.parentNode = f;
        h.parentNode = e;
        i.parentNode = e;
        //指定返回的结点
        return i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode currentNode = solution.generateTree();
        TreeNode nextNode = solution.getNext(currentNode);
        System.out.println(nextNode.data);
    }
}
