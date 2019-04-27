package com.android.riversideproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.riversideproject.R;
import com.android.riversideproject.activities.nurse.NurseAccountInfoActivity;
import com.android.riversideproject.activities.nurse.NurseLocateRemovalVehicle;
import com.android.riversideproject.activities.nurse.NursePatientListActivity;
import com.android.riversideproject.activities.nurse.NursePatientSetupActivity;
import com.android.riversideproject.activities.nurse.NurseScheduleRemovalActivity;
import com.android.riversideproject.adapter.DriverChatAdapter;
import com.android.riversideproject.utilities.Utils;

public class DashboardActivity extends AppCompatActivity {
    private TextView headerTextView;
    private ImageView driverDashboardChatImageView;
    private ImageView driverDashboardLookupImageView;
    private ImageView driverDashboardPendingPickupImageView;
    private ImageView driverDashboardCompletePickupImageView;
    private ImageView driverDashboardContactUsImageView;

    private ImageView nurseAccountInfoImageView;
    private ImageView nurseAccountPatientSetupImageView;
    private ImageView nurseAccountPatientListImageView;
    private ImageView nurseScheduleRemovalImageView;
    private ImageView nurseLocateRemovalVehicleImageView;
    private ImageView nurseChatImageView;
    private ImageView nurseContactUsImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Utils.isDriverApp) {
            setContentView(R.layout.activity_driver_dashboard);
            initDriverDashboard();
        }else{
            setContentView(R.layout.activity_nurse_dashboard);
            initNurseDashboard();
        }


    }

    private void initDriverDashboard(){
        headerTextView = findViewById(R.id.header_title);
        headerTextView.setText("Driver Dashboard");
        driverDashboardChatImageView = findViewById(R.id.driver_dashboard_chat_imageview);
        driverDashboardChatImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, DriverChatActivity.class);
                startActivity(driverDashboardIntent);
            }
        });

        driverDashboardLookupImageView = findViewById(R.id.driver_dashboard_lookup_nurse_imageview);
        driverDashboardLookupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, DriverNurseLookupActivity.class);
                startActivity(driverDashboardIntent);
            }
        });

        driverDashboardPendingPickupImageView = findViewById(R.id.driver_dashboard_pending_pickup_imageview);
        driverDashboardPendingPickupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, DriverPendingPickupActivity.class);
                startActivity(driverDashboardIntent);
            }
        });

        driverDashboardCompletePickupImageView = findViewById(R.id.driver_dashboard_complete_pickup_imageview);
        driverDashboardCompletePickupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, DriverCompletePickupActivity.class);
                startActivity(driverDashboardIntent);
            }
        });

        driverDashboardContactUsImageView = findViewById(R.id.driver_dashboard_contact_us_imageview);
        driverDashboardContactUsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, DriverContactUsActivity.class);
                startActivity(driverDashboardIntent);
            }
        });
    }

    private void initNurseDashboard(){
        headerTextView = findViewById(R.id.header_title);
        headerTextView.setText("Welcome!");
        nurseAccountInfoImageView = findViewById(R.id.nurse_dashboard_account_info_imageview);
        nurseAccountInfoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, NurseAccountInfoActivity.class);
                startActivity(driverDashboardIntent);
            }
        });

        nurseAccountPatientSetupImageView = findViewById(R.id.nurse_dashboard_patient_setup_imageview);
        nurseAccountPatientSetupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, NursePatientSetupActivity.class);
                startActivity(driverDashboardIntent);
            }
        });

        nurseAccountPatientListImageView = findViewById(R.id.nurse_dashboard_patient_list_imageview);
        nurseAccountPatientListImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, NursePatientListActivity.class);
                startActivity(driverDashboardIntent);
            }
        });

        nurseScheduleRemovalImageView = findViewById(R.id.nurse_dashboard_schedule_removal_imageview);
        nurseScheduleRemovalImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, NurseScheduleRemovalActivity.class);
                startActivity(driverDashboardIntent);
            }
        });

        nurseLocateRemovalVehicleImageView = findViewById(R.id.nurse_dashboard_locate_removal_imageview);
        nurseLocateRemovalVehicleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, NurseLocateRemovalVehicle.class);
                startActivity(driverDashboardIntent);
            }
        });

        nurseChatImageView = findViewById(R.id.nurse_dashboard_chat_imageview);
        nurseChatImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, DriverChatActivity.class);
                startActivity(driverDashboardIntent);
            }
        });

        nurseContactUsImageView = findViewById(R.id.nurse_dashboard_contact_us_imageview);
        nurseContactUsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent driverDashboardIntent = new Intent(DashboardActivity.this, DriverContactUsActivity.class);
                startActivity(driverDashboardIntent);
            }
        });
    }
}
