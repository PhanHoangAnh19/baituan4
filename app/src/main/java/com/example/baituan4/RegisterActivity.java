package com.example.baituan4;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // tao nút quay lại
        findViewById(R.id.btnBack).setOnClickListener(v -> {
            finish();
        });

        // next: sang trang set pin
        findViewById(R.id.btnNext).setOnClickListener(v -> {
            startActivity(new Intent(this, SetPinActivity.class));
        });
    }
}
