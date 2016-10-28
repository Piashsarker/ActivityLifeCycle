package com.ptlearnpoint.activitylifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.toString();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
        Log.d(TAG, "Main OnCreate() Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Main onStart() Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Main onPause() Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Main onResume() Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Main onStop() Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Main onDestroy() Called");
    }


}
