package com.kocomer.network.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class NetworkUtil {

    public static void connData(final Handler handler, final String url,final HashMap<String, String> params,final String method){
        new Thread(){
            @Override
            public void run() {
                Message msg = handler.obtainMessage();
                URL urlPath = null;
                try {
                    urlPath = new URL(url);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    msg.obj = "网址错误";
                    handler.sendMessage(msg);
                    return;
                }
                switch (method){
                    case "GET":
                    case "get":{
                        HttpURLConnection connection = null;
                        try {
                            connection = (HttpURLConnection) urlPath.openConnection();
                            connection.setConnectTimeout(8000);
                            if (params != null){
                                for(Map.Entry<String, String> entry : params.entrySet()){
                                    connection.setRequestProperty(entry.getKey(), entry.getValue());
                                }
                            }
                            InputStream inputStream = connection.getInputStream();
                            ByteArrayOutputStream bos = new ByteArrayOutputStream();
                            int data = -1;
                            while ((data = inputStream.read()) != -1){
                                bos.write(data);
                            }
                            byte[] connData = bos.toByteArray();
                            bos.close();
                            inputStream.close();
                            msg.obj = new String(connData, "UTF-8");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }finally {
                            if (connection != null){
                                connection.disconnect();
                            }
                        }
                    }
                    case "Post":
                    case "post":{

                    }
                }
                handler.sendMessage(msg);

            }
        }.start();

    }

}
