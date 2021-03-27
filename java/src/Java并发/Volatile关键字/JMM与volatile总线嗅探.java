package Java并发.Volatile关键字;

/**
 * JMM与volatile总线嗅探:
 *
 * @Author XvYanpeng
 * @Date 2020/4/24 19:51
 */
public class JMM与volatile总线嗅探 {
    public static boolean flag = true;

    public static void main(String[] args) {


        new Thread(() -> {
            while (flag) {
                //do somthing
            }
        }).start();


        new Thread(() -> {
            flag = false;
        }).start();
    }
}
