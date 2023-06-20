package com.example.visionkernel20;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.WindowInsetsController;
import android.view.WindowInsets;


public class Splash_activity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        WindowInsetsController insetsController = getWindow().getInsetsController();
//        if (insetsController != null) {
//            insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
//            insetsController.setSystemBarsBehavior(WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
//        }




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int SPLASH_TIME_OUT = 3000;  // This is 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_activity.this, login_page_activity.class);
                startActivity(intent);

                // This method will be executed once the timer is over
                // Start your app's login activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}


