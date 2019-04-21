package com.android.riversideproject.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.android.riversideproject.R;
import com.android.riversideproject.adapter.DriverChatAdapter;

import java.util.ArrayList;
import java.util.List;

public class DriverChatActivity extends AppCompatActivity {
    private TextView headerTextView;
    private RecyclerView recyclerView;
    private DriverChatAdapter driverChatAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_chat);

        initDashboardScreen();
    }

    private void initDashboardScreen() {
        headerTextView = findViewById(R.id.header_title);
        headerTextView.setText("Chat List");
        recyclerView = (RecyclerView) findViewById(R.id.driver_chat_recyclerView);
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        driverChatAdapter = new DriverChatAdapter(getChatList());
        recyclerView.setAdapter(driverChatAdapter);

    }

    private List<String> getChatList(){
        List<String> chatList = new ArrayList<String>();
        String chatTitle = "Chat Title : ";
        for(int i=0;i< 10;i++){
            chatList.add(chatTitle+i);
        }
        return chatList;
    }

}
