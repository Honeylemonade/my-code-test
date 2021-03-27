package 逆波兰;

import 逆波兰.exception.CalculatorException;

import java.util.Stack;

/**
 * Operation:
 *
 * @Author XvYanpeng
 * @Date 2020/5/8 19:19
 */
public abstract class Operator {
    protected Stack<Double> stack;

    public abstract void operate() throws CalculatorException;

}
