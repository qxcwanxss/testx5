package com.example.qixingchao.testx5;

import android.app.Application;
import android.util.Log;

import com.tencent.smtt.sdk.QbSdk;

/**
 * Created by qixingchao on 2019/1/10.
 */

public class TestApplication extends Application {
    public static final String TAG = "TESTX5_TAG";

    @Override
    public void onCreate() {
        super.onCreate();
        initQbSdk();
    }

    private void initQbSdk() {
        Log.i(TAG, "initQbSdk ");
        //搜集本地tbs内核信息并上报服务器，服务器返回结果决定使用哪个内核。
        QbSdk.PreInitCallback cb = new QbSdk.PreInitCallback() {
            @Override
            public void onViewInitFinished(boolean arg0) {
                //x5內核初始化完成的回调，为true表示x5内核加载成功
                //否则表示x5内核加载失败，会自动切换到系统内核。
                Log.i(TAG, " onViewInitFinished is " + arg0);
            }
            @Override
            public void onCoreInitFinished() {
                Log.i(TAG, " onCoreInitFinished ");
            }
        };
        //x5内核初始化接口
        QbSdk.initX5Environment(getApplicationContext(),  cb);
    }
}
