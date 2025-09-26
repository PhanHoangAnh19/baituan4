package com.example.baituan4;   // ⚠️ giữ nguyên package theo project của bạn

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        findViewById(R.id.btnStart).setOnClickListener(v -> {
            startActivity(new Intent(this, CreateAccountActivity.class));
        });
    }
}
