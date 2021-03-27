package 逆波兰;

import 逆波兰.Operators.*;
import 逆波兰.exception.CalculatorException;
import 逆波兰.exception.ExceptionEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Calculator:
 *
 * @Author XvYanpeng
 * @Date 2020/5/8 19:31
 */
public class Calculator {
    /**
     * 当前栈
     */
    private Stack<Double> stack = new Stack<>();

    /**
     * 历史栈集合
     */
    private ArrayList<Stack<Double>> historyStacks = new ArrayList<>();

    /**
     * 上一次操作
     */
    private String lastOpt;

    /**
     * 核心方法，用于开始计算
     */
    public void startCalculate() {
        while (true) {
            //获取输入的指令合集
            ArrayList<String> opts = getOpts();
            int index = 0;
            boolean hasError = false;
            String remainStr = "";
            for (String s : opts) {
                if (!hasError) {
                    try {
                        excute(s);
                    } catch (Exception e) {
                        System.out.println("第" + (index + 1) + "条指令发生错误");
                        hasError = true;
                        rollback();
                    }
                } else {
                    remainStr += s + " ";
                }
                index++;
            }
            //显示结果
            print();
            if (hasError && remainStr.length() != 0) {
                System.out.println("the：" + remainStr + "were not pushed on to the stack due to the previous error");
            }
        }
    }

    /**
     * 根据输入的字符串获取指令合集
     *
     * @return
     */
    private ArrayList<String> getOpts() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //去掉头尾空格
        str = str.trim();
        //整个操作分割成单独字符串
        ArrayList<String> strings = new ArrayList(Arrays.asList(str.split(" ")));
        return strings;
    }

    /**
     * 执行操作，成功返回true，失败则返回false
     *
     * @return
     */
    private boolean excute(String s) throws Exception {
        // 遍历每个字符串，如果遇到四种运算符就将栈顶前两个元素做对应的运算
        Operator opt = str2OPT(s);
        //执行操作
        if (opt != null) {
            //保留操作符操作的历史栈信息
            historyStacks.add((Stack<Double>) stack.clone());
            opt.operate();
        }
        //更新lastOpt
        if (!s.equals("redo")) {
            lastOpt = s;
        }
        return true;
    }

    /**
     * 将字符串转换为命令,外置操作返回OPT，内置操作返回null
     *
     * @param str
     * @return
     */
    private Operator str2OPT(String str) throws Exception {
        if ("+".equals(str)) {
            return new PlusOperator(this.stack);
        } else if ("-".equals(str)) {
            return new SubtractOperator(this.stack);
        } else if ("*".equals(str)) {
            return new MultiplyOperator(this.stack);
        } else if ("/".equals(str)) {
            return new DivideOperator(this.stack);
        } else if ("sqrt".equals(str)) {
            return new SqrtOperator(this.stack);
        } else if ("n!".equals(str)) {
            return new FactorialOperatror(this.stack);
        } else if ("cos".equals(str)) {
            return new CosOperator(this.stack);
        } else if ("atan".equals(str)) {
            return new AtanOperator(this.stack);
        } else if ("redo".equals(str)) {
            return redo();
        } else if ("undo".equals(str)) {
            undo();
            return null;
        } else if ("clear".equals(str)) {
            clear();
            return null;
        } else {
            // 如果不是运算符，就将该字符串拆箱成 int 后入栈
            pushNum(str);
            return null;
        }
    }

    /**
     * 打印当前栈信息
     */
    private void print() {
        System.out.print("stack：");
        for (double s : stack) {
            //去掉非小数后面的.0
            if (Math.round(s) - s == 0) {
                System.out.print((long) s + " ");
            } else {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }

    /**
     * redo操作
     *
     * @return
     * @throws Exception
     */
    private Operator redo() throws Exception {
        return str2OPT(lastOpt);
    }

    /**
     * undo操作
     *
     * @throws Exception
     */
    private void undo() throws Exception {
        if (historyStacks.size() == 0) {
            throw new CalculatorException(ExceptionEnum.HISTORY_STACK_EXCEPTION);
        }
        //历史中最后一个栈变成当前栈
        Stack<Double> source = historyStacks.get(historyStacks.size() - 1);
        Stack<Double> temp = new Stack<>();
        int sLenth = source.size();
        for (int i = 0; i < sLenth; i++) {
            temp.push(source.pop());
        }
        int tLenth = temp.size();
        this.stack.removeAll(stack);
        for (int i = 0; i < sLenth; i++) {
            this.stack.push(temp.pop());
        }
        //历史栈去掉最后一个栈
        historyStacks.remove(historyStacks.size() - 1);
    }

    /**
     * 清除当前栈操作
     */
    private void clear() {
        //保存当前状态到历史栈信息
        historyStacks.add((Stack<Double>) stack.clone());
        //清除当前栈
        stack.removeAll(stack);
        //设置opt操作为clear
        this.lastOpt = "clear";
    }

    /**
     * 插入数字
     *
     * @param str
     */
    private void pushNum(String str) {
        //保留操作符操作的历史栈信息
        historyStacks.add((Stack<Double>) stack.clone());
        this.stack.push(Double.valueOf(str));
    }

    /**
     * @Author XvYanpeng
     * @Description 发生错误时的回滚操作
     * @Date 2020/5/9 12:35
     */
    private void rollback() {
        try {
            undo();
        } catch (Exception e) {
        }
    }
}
