package 剑指offer.Q37_序列化二叉树;

/**
 * Solution:
 *
 * @author XvYanPeng
 * @date 2019/10/28 17:17
 */
public class Solution {
    public static int index = -1;

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public static String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuffer result = new StringBuffer();
        serializeCore(root, result);
        return result.toString();
    }

    private static void serializeCore(TreeNode treeNode, StringBuffer result) {
        if (treeNode == null) {
            result.append("$");
        } else {
            result.append(treeNode.val);
            serializeCore(treeNode.left, result);
            serializeCore(treeNode.right, result);
        }
    }

    public static TreeNode deserialize(String str) {
        String[] strs = str.split("");
        return deserializeCore(strs);
    }

    private static TreeNode deserializeCore(String[] strs) {
        index++;
        if (!strs[index].equals("$")) {
            TreeNode root = new TreeNode(Integer.parseInt(strs[index]));
            root.left = deserializeCore(strs);
            root.right = deserializeCore(strs);
            return root;
        }
        return null;
    }


    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        a.left = b;
        a.right = c;
        b.left = d;
        c.left = e;
        c.right = f;
        String result = serialize(a);
        System.out.println(result);
        System.out.println(serialize(deserialize(result)));
    }
}
