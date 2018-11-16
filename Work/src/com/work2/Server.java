package com.work2;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(8899);
        byte[] bs = new byte[1024];
        int len;
        Socket st = ss.accept();
        InputStream is = st.getInputStream();
        OutputStream os = st.getOutputStream();
        len = is.read(bs);
        String name = new String(bs,0,len);
        os.write("200".getBytes());

        FileOutputStream fos = new FileOutputStream("F:\\" + name);

        while ((len = is.read(bs)) != -1){
            fos.write(bs,0,len);
        }

        os.close();
        is.close();
        ss.close();

    }

}
