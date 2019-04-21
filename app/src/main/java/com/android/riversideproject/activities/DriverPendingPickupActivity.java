package com.android.riversideproject.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.android.riversideproject.R;
import com.android.riversideproject.adapter.DriverChatAdapter;
import com.android.riversideproject.adapter.DriverPendingPickupAdapter;

import java.util.ArrayList;
import java.util.List;

public class DriverPendingPickupActivity extends AppCompatActivity {
    private TextView headerTextView;
    private RecyclerView recyclerView;
    private DriverPendingPickupAdapter driverPendingPickupAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_pending_pickup);

        initDashboardScreen();
    }

    private void initDashboardScreen() {
        headerTextView = findViewById(R.id.header_title);
        headerTextView.setText("Pending Pickups");

        recyclerView = (RecyclerView) findViewById(R.id.driver_pending_pickup_recyclerView);
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        driverPendingPickupAdapter = new DriverPendingPickupAdapter(getPendingPickupList());
        recyclerView.setAdapter(driverPendingPickupAdapter);
    }

    private List<String> getPendingPickupList(){
        List<String> chatList = new ArrayList<String>();
        String chatTitle = "Pending Pickup Title : ";
        for(int i=0;i< 10;i++){
            chatList.add(chatTitle+i);
        }
        return chatList;
    }

}
