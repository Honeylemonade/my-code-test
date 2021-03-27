package 逆波兰.Operators;

import 逆波兰.Operator;
import 逆波兰.exception.CalculatorException;
import 逆波兰.exception.ExceptionEnum;

import java.util.Stack;

/**
 * PlusOperator:
 *
 * @Author XvYanpeng
 * @Date 2020/5/8 19:22
 */
public class PlusOperator extends Operator {
    public PlusOperator(Stack<Double> stack) {
        this.stack = stack;
    }

    @Override
    public void operate() {
        try {
            stack.push((stack.pop() + stack.pop()));
        } catch (Exception e) {
            throw new CalculatorException(ExceptionEnum.OPERATOR_EXCEPTION);
        }
    }
}
