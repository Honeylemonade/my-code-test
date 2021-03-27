package 逆波兰.exception;

/**
 * CalculatorException:
 *
 * @Author XvYanpeng
 * @Date 2020/5/9 14:59
 */
public class CalculatorException extends RuntimeException {
    private static final long serialVersionUID = 7894999490714984513L;
    private ExceptionEnum exceptionEnum;

    public CalculatorException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public Integer getCode() {
        return exceptionEnum.code;
    }

    public String getMsg() {
        return exceptionEnum.msg;
    }
}
