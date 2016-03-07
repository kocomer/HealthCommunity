package com.kocomer.community.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;

import com.kocomer.community.DetailActivity;
import com.kocomer.community.DoctorDescActivity;

/*
 * Created by lishuo on 16/2/25.
 */
public class JSInterface {

    private Activity activity;
    public JSInterface(Activity activity){
        this.activity = activity;

    }
    @JavascriptInterface
    public void detail(String detailId) {
        Intent intent = new Intent(activity, DetailActivity.class);
        activity.startActivity(intent);
    }

    @JavascriptInterface
    public void activity(String path) {
        Intent intent = new Intent(activity, DetailActivity.class);
        activity.startActivity(intent);
    }

    @JavascriptInterface
    public void doctorDesc(String doctorId) {
        Intent intent = new Intent(activity, DoctorDescActivity.class);
        activity.startActivity(intent);
    }

    @JavascriptInterface
    public void dial(String phone) {
        Intent intent = new Intent(activity, DetailActivity.class);
        activity.startActivity(intent);
    }

    @JavascriptInterface
    public void sendMsg(String phone) {
        Intent intent = new Intent(activity, DetailActivity.class);
        activity.startActivity(intent);
    }
    @JavascriptInterface
    public void addShopcar(String detailId) {
        Intent intent = new Intent(activity, DetailActivity.class);
        activity.startActivity(intent);
    }

}
