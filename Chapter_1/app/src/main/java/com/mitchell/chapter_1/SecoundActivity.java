package com.mitchell.chapter_1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by mitchell on 2016/5/28 0028.
 */
public class SecoundActivity extends Activity {
    private static final String TAG = "SecoundActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        log("onCreate");

    }

    @Override
    protected void onResume() {
        log("onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        log("onStart");
        super.onStart();
    }

    @Override
    protected void onPostResume() {
        log("onPostResume");
        super.onPostResume();
    }

    @Override
    protected void onDestroy() {
        log("onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        log("onRestart");
        super.onRestart();
    }

    @Override
    protected void onStop() {
        log("onStop");
        super.onStop();
    }
    public void log(String msg){
        Log.i(TAG,msg);
    }
}
