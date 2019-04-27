package com.android.riversideproject.activities.nurse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.android.riversideproject.R;
import com.android.riversideproject.adapter.DriverChatAdapter;
import com.android.riversideproject.adapter.NursePatientAdapter;

import java.util.ArrayList;
import java.util.List;

public class NursePatientListActivity extends AppCompatActivity {
    private TextView headerTextView;
    private RecyclerView recyclerView;
    private NursePatientAdapter nursePatientAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nurse_patient_list);

        initDashboardScreen();
    }

    private void initDashboardScreen() {
        headerTextView = findViewById(R.id.header_title);
        headerTextView.setText("Patients List");
        recyclerView = (RecyclerView) findViewById(R.id.nurse_patient_recyclerView);
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        nursePatientAdapter = new NursePatientAdapter(getPatientList());
        recyclerView.setAdapter(nursePatientAdapter);

    }

    private List<String> getPatientList(){
        List<String> patientList = new ArrayList<String>();
        String chatTitle = "Patient List Title : ";
        for(int i=0;i< 10;i++){
            patientList.add(chatTitle+i);
        }
        return patientList;
    }

}