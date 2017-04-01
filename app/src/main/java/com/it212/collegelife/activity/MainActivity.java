package com.it212.collegelife.activity;

import android.app.Activity;

import android.os.Bundle;
import android.util.Log;

import com.it212.collegelife.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("main","istin");
    }
}
