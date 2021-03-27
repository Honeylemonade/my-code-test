package 剑指offer.Q26_树的子结构;

/**
 * Solution:利用递归实现
 *
 * @author XvYanPeng
 * @date 2019/10/14 22:19
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

    public boolean hasSubtree(BinaryTreeNode root1, BinaryTreeNode root2) {
        //合法验证且封闭递归
        if (root1 == null || root2 == null) {
            return false;
        }
        //匹配首节点，相同的进行遍历
        if (root1.value == root2.value && hasSubtreeCore(root1, root2) == true) {
            return true;
        } else {
            //首节点不匹配继续遍历子节点
            return hasSubtree(root1.pleft, root2) || hasSubtree(root1.pright, root2);
        }
    }

    public boolean hasSubtreeCore(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root2 != null && root1.value == root2.value) {
            return hasSubtreeCore(root1.pleft, root2.pleft) && hasSubtreeCore(root1.pright, root2.pright);
        } else {
            if (root2 == null) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        //构建主树
        BinaryTreeNode a = new BinaryTreeNode(8);
        BinaryTreeNode b = new BinaryTreeNode(8);
        BinaryTreeNode c = new BinaryTreeNode(7);
        BinaryTreeNode d = new BinaryTreeNode(9);
        BinaryTreeNode e = new BinaryTreeNode(2);
        BinaryTreeNode f = new BinaryTreeNode(4);
        BinaryTreeNode g = new BinaryTreeNode(7);
        a.pleft = b;
        a.pright = c;
        b.pleft = d;
        b.pright = e;
        e.pleft = f;
        e.pright = g;
        //构建子树
        BinaryTreeNode node1 = new BinaryTreeNode(8);
        BinaryTreeNode node2 = new BinaryTreeNode(9);
        BinaryTreeNode node3 = new BinaryTreeNode(2);
        node1.pleft = node2;
        node1.pright = node3;
        //开始寻找
        System.out.println(new Solution().hasSubtree(a, node1));
    }
}
