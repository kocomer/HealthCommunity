package com.kocomer.community;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class DoctorsFragment extends Fragment {
    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_doctors, container, false);
        webView = (WebView) view.findViewById(R.id.doctors_wv);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://192.168.31.108:8080/app/doctors.jsp");
        return view;
    }

}
