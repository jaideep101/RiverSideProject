package com.android.riversideproject.activities.nurse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.android.riversideproject.R;

public class NurseAccountInfoActivity   extends AppCompatActivity {
    private TextView headerTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_information);

        headerTextView = findViewById(R.id.header_title);
        headerTextView.setText("Account Information");
    }
}
