package main.java.socket;

import jdk.nashorn.internal.parser.JSONParser;

import java.io.*;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangzl
 * Date: 2018/8/7 下午5:20
 * Description:
 */
public class SocketClient {

    //服务器地址
    public static final String IP_ADDR = "localhost";
    //服务器端口号
    public static final int PORT = 9000;

    public static void main(String[] args) throws IOException {

        System.out.println("客户端启动...");
        Socket socket = null;

        try {
            socket = new Socket(IP_ADDR, PORT);
            while (true) {
                BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                String str="你好，这是我的第一个socket";

                bufferedWriter.write(str);

                bufferedWriter.flush();

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    System.out.println(s);
                    break;
                }

                Thread.sleep(5000);
//
//                socket.shutdownOutput();
            }

        }catch (Exception e) {
            System.out.println("客户端异常:" + e.getMessage());
        }finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    socket = null;
                    System.out.println("客户端 finally 异常:" + e.getMessage());
                }
            }
        }

    }
}
