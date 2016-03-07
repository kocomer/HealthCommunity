package com.kocomer.community;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class RegisterActivity  extends JSActivity {
    private static final String url = "http://192.168.31.108:8080/about.html";
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        webView = (WebView) findViewById(R.id.about_wv);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }

    @Override
    public void callback(String data) {

    }
}
