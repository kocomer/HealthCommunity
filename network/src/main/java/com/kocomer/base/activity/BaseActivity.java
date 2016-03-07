package com.kocomer.base.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.kocomer.network.util.NetworkUtil;

import java.util.HashMap;

import cc.ipush.network.R;


public abstract class BaseActivity extends Activity {
    private Handler netHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            String connData = (String) msg.obj;
            callback(connData);
        }
    };
    private Handler imageHandler;

    public void get(String url, HashMap<String, String> params){
        NetworkUtil.connData(netHandler, url, params, "GET");
    }
    public void post(String url, HashMap<String, String> params){
        NetworkUtil.connData(netHandler, url, params, "GET");
    }
    public abstract void callback(String data);
}
