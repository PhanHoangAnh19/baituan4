package com.example.baituan4;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SetPinActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_pin);

        EditText edtPin = findViewById(R.id.edtPin);
        EditText edtConfirmPin = findViewById(R.id.edtConfirmPin);

        // Quay lại Register
        findViewById(R.id.btnBack).setOnClickListener(v -> finish());

        // Tiếp tục (ví dụ sang BankListActivity)
        findViewById(R.id.btnContinue).setOnClickListener(v -> {
            String p1 = edtPin.getText().toString().trim();
            String p2 = edtConfirmPin.getText().toString().trim();

            if (TextUtils.isEmpty(p1) || TextUtils.isEmpty(p2)) {
                Toast.makeText(this, "Vui lòng nhập đủ PIN", Toast.LENGTH_SHORT).show();
                return;
            }
            if (p1.length() < 4) {
                Toast.makeText(this, "PIN tối thiểu 4 số", Toast.LENGTH_SHORT).show();
                return;
            }
            if (!p1.equals(p2)) {
                Toast.makeText(this, "PIN không trùng khớp", Toast.LENGTH_SHORT).show();
                return;
            }

            // TODO: lưu PIN tạm thời (SharedPreferences) nếu muốn
            startActivity(new Intent(this, BankListActivity.class));
        });
    }
}
