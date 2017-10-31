package zjy.com.xf_demo;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * Created by ZhangJiaYu on 2017/10/31.
 */

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        SpeechUtility.createUtility(this, SpeechConstant.APPID +"=59b74ce7");
    }
}
