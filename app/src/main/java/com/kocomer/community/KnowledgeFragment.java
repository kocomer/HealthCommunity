package com.kocomer.community;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class KnowledgeFragment extends Fragment {

    private WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_knowledge, container, false);
        webView = (WebView) view.findViewById(R.id.knowledge_wv);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl ("http://192.168.100.55:8080/knowledge.health");
        return view;
    }

}
