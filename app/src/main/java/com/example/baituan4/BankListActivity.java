package com.example.baituan4;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BankListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_list);

        RecyclerView rv = findViewById(R.id.rvBanks);
        rv.setLayoutManager(new LinearLayoutManager(this));

        String[] banks = {"Vietcombank", "VietinBank", "BIDV", "Techcombank", "MB Bank", "ACB"};
        rv.setAdapter(new BankAdapter(banks, name -> {
            // Chọn bank xong -> qua màn thành công (mock)
            Intent i = new Intent(this, BankLoginSuccessActivity.class);
            i.putExtra("bankName", name);
            startActivity(i);
        }));

        findViewById(R.id.btnBack).setOnClickListener(v -> finish());
    }
}
