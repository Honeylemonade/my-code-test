package 逆波兰.Operators;

import 逆波兰.Operator;
import 逆波兰.exception.CalculatorException;
import 逆波兰.exception.ExceptionEnum;

import java.util.Stack;

/**
 * MultiplyOperator:
 *
 * @Author XvYanpeng
 * @Date 2020/5/8 21:57
 */

public class MultiplyOperator extends Operator {
    public MultiplyOperator(Stack<Double> stack) {
        this.stack = stack;
    }

    @Override
    public void operate() {
        try {
            stack.push((stack.pop() * stack.pop()));
        } catch (Exception e) {
            throw new CalculatorException(ExceptionEnum.OPERATOR_EXCEPTION);
        }

    }
}
