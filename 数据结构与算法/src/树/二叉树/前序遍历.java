package 树.二叉树;


/**
 * 前序遍历:
 *
 * @Author XvYanpeng
 * @Date 2020/5/8 18:25
 */
class TreeNode {
    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }
}

public class 前序遍历 {
    public static void pre(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        pre(root.leftNode);
        pre(root.rightNode);
    }

    public static void main(String[] args) {
        //生成示例的二叉树
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.leftNode = b;
        a.rightNode = c;
        b.leftNode = d;
        b.rightNode = e;
        c.leftNode = f;
        c.rightNode = g;
        pre(a);
    }
}
