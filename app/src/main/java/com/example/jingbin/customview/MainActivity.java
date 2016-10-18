package com.example.jingbin.customview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jingbin.customview.activity.CustomImageViewActivity;
import com.example.jingbin.customview.activity.CustomProgressBarActivity;
import com.example.jingbin.customview.activity.CustomTitleViewActivity;

/**
 * Created by jingbin on 16/9/29.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        findViewById(R.id.bt_custom_view_01).setOnClickListener(this);
        findViewById(R.id.bt_custom_view_02).setOnClickListener(this);
        findViewById(R.id.bt_custom_view_03).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_custom_view_01:// 点击更换验证码(4位随机数字)
                startActivity(new Intent(v.getContext(), CustomTitleViewActivity.class));
                break;
            case R.id.bt_custom_view_02:// 图文搭配(上图下文)
                startActivity(new Intent(v.getContext(), CustomImageViewActivity.class));
                break;
            case R.id.bt_custom_view_03:// 自定义圆形进度条
                startActivity(new Intent(v.getContext(), CustomProgressBarActivity.class));
                break;
            default:
                break;
        }
    }
}
