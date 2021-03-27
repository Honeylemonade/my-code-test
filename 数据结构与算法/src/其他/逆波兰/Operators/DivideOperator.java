package 逆波兰.Operators;

import 逆波兰.Operator;
import 逆波兰.exception.CalculatorException;
import 逆波兰.exception.ExceptionEnum;

import java.util.Stack;

/**
 * DivideOperator:
 *
 * @Author XvYanpeng
 * @Date 2020/5/8 21:59
 */
public class DivideOperator extends Operator {
    public DivideOperator(Stack<Double> stack) {
        this.stack = stack;
    }

    @Override
    public void operate() {
        try {
            //num不能为0
            Double num = stack.pop();
            if (num == 0) {
                throw new CalculatorException(ExceptionEnum.OPERATOR_EXCEPTION);
            }
            stack.push((stack.pop() / num));
        } catch (Exception e) {
            throw new CalculatorException(ExceptionEnum.OPERATOR_EXCEPTION);
        }

    }
}
