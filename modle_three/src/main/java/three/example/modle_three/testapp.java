package three.example.modle_three;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @Author: zhouXiaoyu
 * @CreateDate: 2019/5/31
 * @CreateTime: 下午 3:20
 */
public class testapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(this);
    }
}
