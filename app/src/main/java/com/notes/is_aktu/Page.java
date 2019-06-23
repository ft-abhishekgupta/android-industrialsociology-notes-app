package com.notes.is_aktu;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Page extends Fragment {

    static String t="Industrial Sociology";
    static String url="";
    View v;
    WebView mWebView = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.frag_page, container, false);
        getActivity().setTitle(t);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        mWebView = (WebView)getView().findViewById(R.id.wv);
        WebSettings settings = mWebView.getSettings();
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSupportZoom(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        mWebView.loadUrl(url);
    }
}
