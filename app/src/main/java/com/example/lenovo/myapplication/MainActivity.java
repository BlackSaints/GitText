package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag","f1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","f2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","222");
    }
}
