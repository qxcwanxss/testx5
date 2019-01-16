package com.example.qixingchao.testx5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

public class DomX5 extends AppCompatActivity {
    WebView wv;
    String url = "file:///android_asset/localStorageTest.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x5);

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
        if (wv.getX5WebViewExtension() == null) {
            Log.i(TestApplication.TAG, "已加载了X5内核");
        } else {
            Log.i(TestApplication.TAG, "已加载了Chrome内核");
        }
    }

    private void setting(){
        WebSettings setting = wv.getSettings();
        setting.setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        setting.setDomStorageEnabled(true);
        setting.setJavaScriptEnabled(true);
    }
}
