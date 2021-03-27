package 网络编程.BIO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TimeServer:
 *
 * @Author XvYanpeng
 * @Date 2020/7/16 16:36
 */
public class TimeServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Time server 在8080端口开启");
        Socket socket = null;
        while (true) {
            //下面这段代码是阻塞操作，如果没有监听到连接，则一直阻塞在accept上面
            socket = serverSocket.accept();
            new Thread(new TimeClientHandler(socket)).start();
        }
    }
}
