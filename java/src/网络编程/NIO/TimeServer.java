package 网络编程.NIO;

/**
 * TimeServer:
 *
 * @Author XvYanpeng
 * @Date 2020/7/17 18:10
 */
public class TimeServer {
    public static void main(String[] args) {
        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(8080);
        new Thread(timeServer, "NIO-MultiplexerTimeServer-001").start();
    }
}