package com.work2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {
        File file = new File("D:\\音乐.mp3");
        FileInputStream fis = new FileInputStream(file);
        byte[] bs = new byte[1024];
        int len;
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("127.0.0.1",8899));
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();
        os.write(file.getName().getBytes());

        String msg = new String(bs,0,is.read(bs));
        System.out.println(msg);

        while ((len = fis.read(bs)) != -1){
            os.write(bs,0,len);
        }

        is.close();
        os.close();
        socket.close();




    }

}
