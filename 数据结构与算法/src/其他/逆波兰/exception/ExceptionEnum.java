package 逆波兰.exception;

/**
 * ExceptionEnum:
 *
 * @Author XvYanpeng
 * @Date 2020/5/9 14:42
 */
public enum ExceptionEnum {
    OPERATOR_EXCEPTION(0, "操作符计算异常"),
    HISTORY_STACK_EXCEPTION(1, "历史栈为空");

    public final Integer code;
    public final String msg;


    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
