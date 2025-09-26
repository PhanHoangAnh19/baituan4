package com.example.baituan4;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BankLoginSuccessActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_login_success);

        String bank = getIntent().getStringExtra("bankName");
        TextView tv = findViewById(R.id.tvMsg);
        tv.setText("Bank login success\n" + (bank != null ? bank : ""));

        findViewById(R.id.btnDone).setOnClickListener(v -> finish());
    }
}
