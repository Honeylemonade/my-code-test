package 逆波兰.Operators;

import 逆波兰.Operator;
import 逆波兰.exception.CalculatorException;
import 逆波兰.exception.ExceptionEnum;

import java.util.Stack;

/**
 * FactorialOperatror:阶乘，如果为小数，则转换为整形
 *
 * @Author XvYanpeng
 * @Date 2020/5/9 9:51
 */
public class FactorialOperatror extends Operator {
    public FactorialOperatror(Stack<Double> stack) {
        this.stack = stack;
    }

    @Override
    public void operate() {
        try {
            double num = this.stack.pop();
            if (num < 0) {
                throw new CalculatorException(ExceptionEnum.OPERATOR_EXCEPTION);
            }
            double result = 1d;
            for (int i = 1; i <= num; i++) {
                result = result * i;
            }
            this.stack.push(result);
        } catch (Exception e) {
            throw new CalculatorException(ExceptionEnum.OPERATOR_EXCEPTION);
        }
    }
}
