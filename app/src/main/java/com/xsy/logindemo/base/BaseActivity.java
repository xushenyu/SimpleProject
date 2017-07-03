package com.xsy.logindemo.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by xsy on 2017/6/30.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//禁止所有Acitity横屏
        setContentView(getLayoutId());
        initView();
        initListener();
    }

    protected abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void initListener();


}
