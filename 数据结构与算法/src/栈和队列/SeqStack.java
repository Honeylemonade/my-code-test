package 栈和队列;

/**
 * SeqStack:顺序栈，使用数组实现
 *
 * @author XvYanPeng
 * @date 2019/9/6 9:49
 */
public class SeqStack {
    private String[] items;
    private int maxLength;
    private int curentLength;

    public SeqStack(int maxLength) {
        this.items = new String[maxLength];
        this.maxLength = maxLength;
        this.curentLength = 0;
    }

    /**
     * @return void
     * @description 入栈操作
     * @params [item]
     * @date 2019/9/6
     */
    public void push(String item) {
        if (curentLength >= maxLength) {
            System.out.println("The Stack has been fulled！");
        } else {
            items[curentLength] = item;
            curentLength++;
        }
    }

    /**
     * @return void
     * @description 出栈操作
     * @params []
     * @date 2019/9/6
     */
    public void pop() {
        if (curentLength == 0) {
            System.out.println("The stack has been empty!");
        } else {
            curentLength--;
            items[curentLength] = null;
        }
    }

    public static void main(String[] args) {
        SeqStack seqStack = new SeqStack(5);
        seqStack.push("a");
        seqStack.push("a");
        seqStack.push("a");
        seqStack.push("a");
        seqStack.pop();
    }
}
