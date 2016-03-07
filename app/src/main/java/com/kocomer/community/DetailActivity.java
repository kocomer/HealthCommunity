package com.kocomer.community;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * 详情
 */
public class DetailActivity extends Activity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        webView = (WebView) findViewById(R.id.detail_wv);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://192.168.31.108:8080/app/detail.android");
    }
}
