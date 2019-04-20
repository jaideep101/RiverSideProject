package com.android.riversideproject.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.android.riversideproject.R;

public class DriverContactUsActivity extends AppCompatActivity {
    private TextView headerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_dashboard);

        initDashboardScreen();
    }

    private void initDashboardScreen() {
        headerTextView = findViewById(R.id.header_title);
        headerTextView.setText("Contact us");
    }

}
