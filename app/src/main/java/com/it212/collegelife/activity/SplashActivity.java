package com.it212.collegelife.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.it212.collegelife.R;
import com.it212.collegelife.utils.Model;

public class SplashActivity extends Activity {
    private boolean isTurnTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Model.getInstance().getClobeThreadPool().execute(new Runnable() {
            @Override
            public void run() {
                Log.e("ss","ddd");
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                turnTomain();
            }
        }, 2000);

    }

    private void turnTomain() {
        if (!isTurnTo) {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            isTurnTo = true;
            finish();
        }
    }
}
