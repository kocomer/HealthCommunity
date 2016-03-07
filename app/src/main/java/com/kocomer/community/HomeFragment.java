package com.kocomer.community;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.kocomer.base.activity.BaseFragment;
import com.kocomer.community.helper.JSInterface;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends JSFragment implements View.OnClickListener{
    private WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        webView = (WebView) view.findViewById(R.id.home_wv);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://192.168.31.108:8080/index.health");
        webView.addJavascriptInterface(this, "platform");
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
