package Java基础.异常;

/**
 * Main:
 *
 * @Author XvYanpeng
 * @Date 2020/7/1 23:12
 */
public class Main {
    public static void main(String[] args) {
        //抛出的是非运行时异常，不需要去处理
        b();
        d();

        //跑出的是Exception，包括runtime和非runtime，一定要去处理
        try {
            a();
            c();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    //一定要做处理，不然会报错，必须要try 或者向上抛出
    public static void a() throws Throwable {
        throw new Throwable("22");
    }

    //不需要做处理
    public static void b() {
        throw new Error("123");
    }

    //一定要做处理，不然会报错，必须要try 或者向上抛出
    public static void c() throws Exception {
        throw new Exception("123");
    }

    //不需要做处理
    public static void d() {
        throw new RuntimeException("123");
    }

}
