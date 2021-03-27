package 栈和队列;

/**
 * ListStack:
 *
 * @author XvYanPeng
 * @date 2019/9/6 9:59
 */
public class ListStack {
    class StackNode {
        private String item;
        StackNode nextNode;

        public StackNode(String item) {
            this.item = item;
        }
    }

    private StackNode headNode;
    private int maxLength;
    private int currentLength;

    public ListStack(int maxLength) {
        this.headNode = null;
        this.maxLength = maxLength;
        this.currentLength = 0;
    }

    public void push(String item) {
        if (currentLength == maxLength) {
            System.out.println("Full!");
        } else {
            if (currentLength == 0) {
                headNode = new StackNode(item);
                currentLength++;
            } else {
                StackNode tempNode = headNode;
                for (int i = 0; i < currentLength - 1; i++) {
                    tempNode = tempNode.nextNode;
                }
                tempNode.nextNode = new StackNode(item);
                currentLength++;
            }
        }
    }

    public void pop() {
        if (currentLength == 0) {
            System.out.println("Empty!");
        } else {
            currentLength--;
            StackNode tempNode = headNode;
            for (int i = 0; i < currentLength; i++) {
                tempNode = tempNode.nextNode;
            }
            tempNode = null;
        }
    }

    public static void main(String[] args) {
        ListStack listStack = new ListStack(5);
        listStack.pop();
        listStack.push("a");
        listStack.push("a");
        listStack.push("a");
        listStack.push("a");
        listStack.push("a");
        listStack.pop();
    }
}
