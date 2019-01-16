package com.example.qixingchao.testx5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

public class X5Activity extends AppCompatActivity {
    WebView wv;
    //String url = "http://soft.imtt.qq.com/browser/tes/feedback.html";
    //String url = "https://www.jianshu.com/p/e306ae0f1f03";
    //String url1 = "https://www.jianshu.com/p/8fcbf06a4c3a";
    String url = "https://www.baidu.com";

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
        /*if(MainActivity.i % 2 == 0){
            wv.loadUrl(url);
        }else{
            wv.loadUrl(url1);
        }
        MainActivity.i ++;*/

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
        setting.setCacheMode(android.webkit.WebSettings.LOAD_CACHE_ELSE_NETWORK);
        setting.setDomStorageEnabled(true);
        setting.setJavaScriptEnabled(true);
    }
}
