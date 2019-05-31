package three.example.modle_three;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/modle_three/MainActivity")
public class MainActivity extends AppCompatActivity {
    //获取传过来的数据
    @Autowired(name = "key")
    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_three);
        setContentView(R.layout.activity_three);
        ARouter.getInstance().inject(this);
        TextView viewById = findViewById(R.id.three);
        if (TextUtils.isEmpty(key)) {
            viewById.setText("木有传过来值");
        } else {
            viewById.setText(key);
        }
    }

}
