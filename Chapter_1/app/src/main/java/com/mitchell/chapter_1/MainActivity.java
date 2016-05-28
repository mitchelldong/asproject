package com.mitchell.chapter_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
