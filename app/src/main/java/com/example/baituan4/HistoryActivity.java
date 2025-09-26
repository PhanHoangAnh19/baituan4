package com.example.baituan4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HistoryActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        RecyclerView rv = findViewById(R.id.rvHistory);
        rv.setLayoutManager(new LinearLayoutManager(this));

        String[] items = {
                "12:01  •  Paid 50.000đ to Coffee",
                "09:15  •  Paid 120.000đ to Groceries",
                "Yesterday • Received 200.000đ",
                "2 days ago • Paid 30.000đ to Parking"
        };
        rv.setAdapter(new SimpleStringAdapter(items));

        findViewById(R.id.btnBack).setOnClickListener(v -> finish());
    }
}
