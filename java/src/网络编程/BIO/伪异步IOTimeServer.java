package 网络编程.BIO;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 伪异步IOTimeServer:
 *
 * @Author XvYanpeng
 * @Date 2020/7/17 9:57
 */
public class 伪异步IOTimeServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("开始8080端口");
        Socket socket = null;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,
                100,
                10L,
                TimeUnit.MILLISECONDS,
                new SynchronousQueue<>());
        while (true) {
            socket = serverSocket.accept();
            threadPoolExecutor.execute(new TimeClientHandler(socket));
        }

    }

}
