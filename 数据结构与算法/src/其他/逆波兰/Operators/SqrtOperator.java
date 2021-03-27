package 逆波兰.Operators;

import 逆波兰.Operator;
import 逆波兰.exception.CalculatorException;
import 逆波兰.exception.ExceptionEnum;

import java.util.Stack;

/**
 * SqrtOperator:
 *
 * @Author XvYanpeng
 * @Date 2020/5/8 21:59
 */
public class SqrtOperator extends Operator {
    public SqrtOperator(Stack<Double> stack) {
        this.stack = stack;
    }

    @Override
    public void operate() {
        try {
            stack.push(Math.sqrt(stack.pop()));
        } catch (Exception e) {
            throw new CalculatorException(ExceptionEnum.OPERATOR_EXCEPTION);
        }

    }
}
