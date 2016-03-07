package com.kocomer.community;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * 医生介绍
 */
public class DoctorDescActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_desc);
        WebView webView = (WebView)findViewById(R.id.doctor_wv);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://192.168.31.108:8080/app/doctorDesc.android");
    }
}
