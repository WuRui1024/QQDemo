package com.andy.qqdemo;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * 类描述：
 * 创建人：yekh
 * 创建时间：2017/7/7 14:25
 */
public class App extends Application{
    {
        PlatformConfig.setQQZone("1106198509","Z9wLCcdD7dvmypub");
    }
    private UMShareAPI mUMShareAPI;
    @Override
    public void onCreate() {
        super.onCreate();

        mUMShareAPI = UMShareAPI.get(this);
    }

    public UMShareAPI getUMShareAPI(){
        return mUMShareAPI;
    }
}
