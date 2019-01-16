package com.example.qixingchao.testx5;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;


public class MainActivity extends AppCompatActivity {
    /*WebView wv;
    String url = "http://soft.imtt.qq.com/browser/tes/feedback.html";*/

    public static int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        //initData();
    }

    private void initView() {
        //wv = findViewById(R.id.wv);
        Button btnx5 = findViewById(R.id.btnx5);
        Button btnx52 = findViewById(R.id.btnx52);
        Button btnchrome = findViewById(R.id.btnchrome);
        Button domx5 = findViewById(R.id.domx5);
        Button domchrome = findViewById(R.id.domchrome);

        btnx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, X5Activity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        btnx52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, X52Activity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        btnchrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChormeActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        domx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DomX5.class);
                MainActivity.this.startActivity(intent);
            }
        });
        domchrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DomChrome.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

    /*private void initData() {
        wv.loadUrl(url);
        wv.setWebViewClient(new WebViewClient() {

        });
        if (wv.getX5WebViewExtension() == null) {
            Log.i(TestApplication.TAG, "已加载了X5内核");
        } else {
            Log.i(TestApplication.TAG, "已加载了Chrome内核");
        }
        WebSettings settings = wv.getSettings();           //和系统webview一样
        settings.setJavaScriptEnabled(true);                 //支持Javascript 与js交互
    }*/

    /*private void initData1() {
        WebSettings settings = wv.getSettings();           //和系统webview一样
        settings.setJavaScriptEnabled(true);                    //支持Javascript 与js交互
        settings.setJavaScriptCanOpenWindowsAutomatically(true);//支持通过JS打开新窗口
        settings.setAllowFileAccess(true);                      //设置可以访问文件
        settings.setSupportZoom(true);                          //支持缩放
        settings.setBuiltInZoomControls(true);                  //设置内置的缩放控件
        settings.setUseWideViewPort(true);                      //自适应屏幕
        settings.setSupportMultipleWindows(true);               //多窗口
        settings.setDefaultTextEncodingName("utf-8");            //设置编码格式
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheMaxSize(Long.MAX_VALUE);
        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);       //缓存模式
        wv.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageStarted(WebView webView, String s, Bitmap bitmap) {
                super.onPageStarted(webView, s, bitmap);
            }

            @Override
            public void onPageFinished(WebView webView, String s) {
                super.onPageFinished(webView, s);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String url) {
                webView.loadUrl(url);
                return true;
            }

            @Override
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                sslErrorHandler.proceed();//忽略SSL证书错误
            }
        });

        wv.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView webView, String s, String s1, JsResult jsResult) {
                return super.onJsAlert(webView, s, s1, jsResult);
            }

            @Override
            public void onReceivedTitle(WebView webView, String s) {
                super.onReceivedTitle(webView, s);
            }

            @Override
            public void onProgressChanged(WebView webView, int progress) {
                super.onProgressChanged(webView, progress);
            }
        });
        wv.loadUrl(url);
    }*/
}
