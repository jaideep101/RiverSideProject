package com.android.riversideproject.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.riversideproject.R;

public class LoginActivity extends AppCompatActivity {
    private TextView headerTextView;
    private Button loginButton;
    private Button registerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        headerTextView = findViewById(R.id.header_title);
        headerTextView.setText("Login");

        loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(LoginActivity.this, DriverDashboardActivity.class);
                startActivity(loginIntent);
            }
        });

        registerButton = findViewById(R.id.login_register_button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}
