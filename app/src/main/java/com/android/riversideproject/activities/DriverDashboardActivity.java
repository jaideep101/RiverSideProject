package com.android.riversideproject.activities;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.riversideproject.R;

public class DriverDashboardActivity extends AppCompatActivity {
    private TextView headerTextView;
    private ImageView driverDashboardChatImageView;
    private ImageView driverDashboardLookupImageView;
    private ImageView driverDashboardPendingPickupImageView;
    private ImageView driverDashboardCompletePickupImageView;
    private ImageView driverDashboardContactUsImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_dashboard);

        initDashboardScreen();
    }

    private void initDashboardScreen(){
        headerTextView = findViewById(R.id.header_title);
        headerTextView.setText("Driver Dashboard");

        driverDashboardChatImageView = findViewById(R.id.driver_dashboard_chat_imageview);
        driverDashboardChatImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        driverDashboardLookupImageView = findViewById(R.id.driver_dashboard_lookup_nurse_imageview);
        driverDashboardLookupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        driverDashboardPendingPickupImageView = findViewById(R.id.driver_dashboard_pending_pickup_imageview);
        driverDashboardPendingPickupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        driverDashboardCompletePickupImageView = findViewById(R.id.driver_dashboard_complete_pickup_imageview);
        driverDashboardCompletePickupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        driverDashboardContactUsImageView = findViewById(R.id.driver_dashboard_contact_us_imageview);
        driverDashboardContactUsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
