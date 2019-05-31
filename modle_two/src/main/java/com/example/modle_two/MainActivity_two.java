package com.example.modle_two;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/modle_tow/MainActivity_two")
public class MainActivity_two extends AppCompatActivity {
    //获取传过来的数据
    @Autowired(name = "key")
    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        ARouter.getInstance().inject(this);
        TextView viewById = findViewById(R.id.two);
        if (TextUtils.isEmpty(key)) {
                viewById.setText("木有传过来值");
        }else {
            viewById.setText(key);
        }
    }
}
