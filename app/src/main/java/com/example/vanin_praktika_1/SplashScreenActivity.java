package com.example.vanin_praktika_1;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import androidx.annotation.Nullable;

public class SplashScreenActivity extends Activity {
    private Intent myintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        myintent = new Intent(this, MainActivity.class);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(myintent);
                finish();
            }
        }).start();
    }
}
