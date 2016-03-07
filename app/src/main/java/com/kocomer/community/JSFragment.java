package com.kocomer.community;


import android.content.Intent;
import android.webkit.JavascriptInterface;

import com.kocomer.base.activity.BaseFragment;


public class JSFragment extends BaseFragment {

    @JavascriptInterface
    public void detail(String detailId) {
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        getActivity().startActivity(intent);
    }

    @JavascriptInterface
    public void activity(String path) {
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        getActivity().startActivity(intent);
    }

    @JavascriptInterface
    public void doctorDesc(String doctorId) {
        Intent intent = new Intent(getActivity(), DoctorDescActivity.class);
        getActivity().startActivity(intent);
    }

    @JavascriptInterface
    public void dial(String phone) {
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        getActivity().startActivity(intent);
    }

    @JavascriptInterface
    public void sendMsg(String phone) {
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        getActivity().startActivity(intent);
    }
    @JavascriptInterface
    public void addShopcar(String detailId) {
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        getActivity().startActivity(intent);
    }
    @JavascriptInterface
    public void searchByCategory(String category) {
        Intent intent = new Intent(getActivity(), SearchActivity.class);
        getActivity().startActivity(intent);
    }

}
