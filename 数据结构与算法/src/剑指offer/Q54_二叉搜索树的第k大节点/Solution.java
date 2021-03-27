package 剑指offer.Q54_二叉搜索树的第k大节点;

/**
 * Solution:
 *
 * @Author XvYanpeng
 * @Date 2020/3/18 10:55
 */
public class Solution {
    public static class Key {
        public int value;

        public Key(int value) {
            this.value = value;
        }
    }

    /**
     * 获取第k大的node
     *
     * @return
     */
    public static Node getKthNode(Node node, Key key) {
        Node result = node;
        if (node.left != null && key.value > 0) {
            result = getKthNode(node.left, key);
        }
        key.value--;
        if (key.value <= 0) {
            if (key.value == 0) {
                result = node;
            }
            return result;
        }
        if (node.right != null && key.value > 0) {
            result = getKthNode(node.right, key);
        }
        return result;
    }

    public static void main(String[] args) {
        //构建二叉搜索树
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();
        Node n8 = new Node();
        n2.value = 2;
        n3.value = 3;
        n4.value = 4;
        n5.value = 5;
        n6.value = 6;
        n7.value = 7;
        n8.value = 8;
        n5.left = n3;
        n5.right = n7;
        n3.left = n2;
        n3.right = n4;
        n7.left = n6;
        n7.right = n8;
        //System.out.println(getKthNode(n5, new Key(1)).value);
        System.out.println(getKthNode(n5, new Key(2)).value);
        System.out.println(getKthNode(n5, new Key(3)).value);
        System.out.println(getKthNode(n5, new Key(4)).value);
        System.out.println(getKthNode(n5, new Key(5)).value);
        System.out.println(getKthNode(n5, new Key(6)).value);
        System.out.println(getKthNode(n5, new Key(7)).value);

    }
}
