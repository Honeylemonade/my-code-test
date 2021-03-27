package 逆波兰.Operators;

import 逆波兰.Operator;
import 逆波兰.exception.CalculatorException;
import 逆波兰.exception.ExceptionEnum;

import java.util.Stack;

/**
 * SubtractOperator:
 *
 * @Author XvYanpeng
 * @Date 2020/5/8 21:55
 */
public class SubtractOperator extends Operator {

    public SubtractOperator(Stack<Double> stack) {
        this.stack = stack;
    }

    @Override
    public void operate() {
        try {
            double num = stack.pop();
            stack.push((stack.pop() - num));
        } catch (Exception e) {
            throw new CalculatorException(ExceptionEnum.OPERATOR_EXCEPTION);
        }

    }
}
