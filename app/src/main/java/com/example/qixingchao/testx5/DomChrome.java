package com.example.qixingchao.testx5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DomChrome extends AppCompatActivity {
    WebView wv;
    String url = "file:///android_asset/localStorageTest.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chorme);

        initView();
        initData();
    }
    private void initView() {
        wv = findViewById(R.id.wv);
    }

    private void initData() {
        setting();
        wv.loadUrl(url);
        wv.setWebViewClient(new WebViewClient() {
        });
        wv.setWebChromeClient(new WebChromeClient(
        ));
    }

    private void setting(){
        WebSettings setting = wv.getSettings();
        setting.setCacheMode(WebSettings.LOAD_DEFAULT);
        setting.setDomStorageEnabled(true);
        setting.setJavaScriptEnabled(true);
    }
}

