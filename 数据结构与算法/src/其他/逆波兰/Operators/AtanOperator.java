package 逆波兰.Operators;

import 逆波兰.Operator;
import 逆波兰.exception.CalculatorException;
import 逆波兰.exception.ExceptionEnum;

import java.util.Stack;

/**
 * AtanOperator:
 *
 * @Author XvYanpeng
 * @Date 2020/5/9 10:05
 */
public class AtanOperator extends Operator {
    public AtanOperator(Stack<Double> stack) {
        this.stack = stack;
    }

    @Override
    public void operate() {
        try {
            stack.push(Math.atan(stack.pop()));
        } catch (Exception e) {
            throw new CalculatorException(ExceptionEnum.OPERATOR_EXCEPTION);
        }
    }
}
