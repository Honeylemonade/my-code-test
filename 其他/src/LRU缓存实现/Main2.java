package LRU缓存实现;

import java.util.HashMap;
import java.util.Map;

/**
 * Main2:
 *
 * @Author XvYanpeng
 * @Date 2020/7/11 13:44
 */
public class Main2 {
    static class LRUNode {
        public String key;
        public String value;
        public LRUNode pre;
        public LRUNode next;

        public LRUNode(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    static class LRUCache {
        private Map<String, LRUNode> cache = new HashMap<>();
        private int capacity;
        private LRUNode head;
        private LRUNode tail;

        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public void put(String key, String value) {
            LRUNode node = cache.get(key);
            if (node != null) {
                node.value = value;
                removeNode(node);
            } else {
                node = new LRUNode(key, value);
                if (cache.size() >= capacity) {
                    cache.remove(tail.key);
                    removeNode(tail);
                }
                cache.put(key, node);
            }
            setHead(node);
        }

        public String get(String key) {
            if (cache.containsKey(key)) {
                LRUNode node = cache.get(key);
                removeNode(node);
                setHead(node);
                return node.value;
            }
            return null;
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder();
            str.append('[');
            LRUNode node = head;
            while (node != null) {
                str.append("{" + node.key + "," + node.value + "}");
                if (node.next != null) {
                    str.append(" -> ");
                }
                node = node.next;
            }
            str.append(']');
            return str.toString();
        }

        private void setHead(LRUNode node) {
            if (head != null) {
                node.next = head;
                head.pre = node;
            }
            node.pre = null;
            head = node;
            if (tail == null) {
                tail = node;
            }
        }

        /**
         * @Author XvYanpeng
         * @Description 从链表中移出该结点，分成三种情况,头，中，尾，并且还要考虑一下链表的长度
         * @Date 2020/7/11 14:28
         */
        private void removeNode(LRUNode node) {
            // 如果是头结点
            if (node.pre == null) {
                head = node.next;
            } else {
                // 普通节点next指针处理
                node.pre.next = node.next;
            }
            // 如果是尾节点
            if (node.next == null) {
                tail = node.pre;
            } else {
                // 普通节点pre指针处理
                node.next.pre = node.pre;
            }
            // 释放node
            node.pre = null;
            node.next = null;
        }
    }

    public static void main(String args[]) {
        LRUCache cache = new LRUCache(5);
        cache.put("1号", "1");
        System.out.println(cache.toString());
        cache.put("2号", "2");
        System.out.println(cache.toString());
        cache.put("3号", "3");
        System.out.println(cache.toString());
        cache.put("4号", "4");
        System.out.println(cache.toString());
        cache.put("5号", "5");
        System.out.println(cache.toString());
        cache.put("6号", "6");
        System.out.println(cache.toString());
        cache.get("2号");
        System.out.println(cache.toString());
        cache.put("7号", "7");
        System.out.println(cache.toString());
    }
}
