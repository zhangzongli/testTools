package main.java;

import com.sun.deploy.net.HttpResponse;
import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by zhangzl on 2017/11/17.
 */
public class Weather {


    public static void main(String[] args) {
        HttpURLConnection con = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            String path = "http://i.tianqi.com/index.php?c=code&id=12&icon=1&num=5&site=";
            URL url = new URL(path);// 构建一个URL对象
            con = (HttpURLConnection) url.openConnection();// 打开连接
            con.setConnectTimeout(5000);// 设置超时时间
            con.setRequestProperty("Content-type", "text/html");
            con.setRequestProperty("Accept-Charset", "utf-8");
            con.setRequestProperty("contentType", "utf-8");
            if (con.getResponseCode() == 200) {// 判断是否请求成功，状态码为200
                InputStream inStream = con.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream, "UTF-8"), 8192);
                String line = null;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line + "\n");
                }
                reader.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (null != con) {
                con.disconnect();
            }
        }
        System.out.println(stringBuilder);

    }

}
