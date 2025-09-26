package com.example.baituan4;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        // Nút Back: quay lại Splash
        findViewById(R.id.btnBack).setOnClickListener(v -> {
            finish(); // kết thúc Activity này -> trở về SplashActivity
        });

        // Nút Register: sang RegisterActivity
        findViewById(R.id.btnRegister).setOnClickListener(v -> {
            startActivity(new Intent(this, RegisterActivity.class));
        });
    }
}
