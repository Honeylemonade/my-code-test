package 逆波兰.Operators;

import 逆波兰.Operator;
import 逆波兰.exception.CalculatorException;
import 逆波兰.exception.ExceptionEnum;

import java.util.Stack;

/**
 * CosOperator:
 *
 * @Author XvYanpeng
 * @Date 2020/5/9 9:59
 */
public class CosOperator extends Operator {
    public CosOperator(Stack<Double> stack) {
        this.stack = stack;
    }

    @Override
    public void operate() {
        try {
            stack.push(Math.cos(stack.pop()));
        } catch (Exception e) {
            throw new CalculatorException(ExceptionEnum.OPERATOR_EXCEPTION);
        }

    }
}
