package tina.com.tiaopiaopiao;

import android.util.Log;

/**
 * Created by baby on 2018/3/6.
 */

public class OneService extends BaseService {
    int i=0;
    private String TAG="Tina";
    @Override
    public void onCreate() {
        super.onCreate();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    Log.i(TAG, "run: "+(i++));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
