package com.example.orangerabbit.intenttest;


import android.annotation.SuppressLint;
import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class orangeIntentService extends IntentService {

    private static final String TAG = "com.example.orangerabbit.intenttest";

    public orangeIntentService() {
        super("orangeIntentService");
    }


    @SuppressLint("LongLogTag")
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG,"Service has been started");
    }
}
