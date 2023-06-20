package com.example.visionkernel20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;

public class login_page_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        WindowInsetsController insetsController = getWindow().getInsetsController();
//        if (insetsController != null) {
//            insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
//            insetsController.setSystemBarsBehavior(WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
//
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }
}