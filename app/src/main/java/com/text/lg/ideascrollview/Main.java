package com.text.lg.ideascrollview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import qiu.niorgai.StatusBarCompat;

/**
 * 类描述：
 * 创建人：${Peter}
 * 创建时间： 2019/1/24.
 */
public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.aciti2);
        StatusBarCompat.translucentStatusBar(this, false);
    }
}
