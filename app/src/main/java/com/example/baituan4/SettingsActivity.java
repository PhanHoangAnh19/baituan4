package com.example.baituan4;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        findViewById(R.id.btnBack).setOnClickListener(v -> finish());

        Switch sw1 = findViewById(R.id.swNotif);
        Switch sw2 = findViewById(R.id.swDark);
        sw1.setOnCheckedChangeListener((b, checked) ->
                Toast.makeText(this, "Notifications: " + checked, Toast.LENGTH_SHORT).show());
        sw2.setOnCheckedChangeListener((b, checked) ->
                Toast.makeText(this, "Dark mode: " + checked, Toast.LENGTH_SHORT).show());
    }
}
