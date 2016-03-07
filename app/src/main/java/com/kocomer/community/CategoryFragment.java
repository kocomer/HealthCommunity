package com.kocomer.community;


import android.os.Bundle;import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment implements View.OnClickListener{
    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        webView = (WebView) view.findViewById(R.id.category_wv);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://192.168.31.108:8080/app/category.jsp");
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
