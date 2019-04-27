package com.android.riversideproject.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.riversideproject.R;

import java.util.List;

public class NursePatientAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> patientList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nursePatientTitleTextView;

        public MyViewHolder(View view) {
            super(view);
            nursePatientTitleTextView = (TextView) view.findViewById(R.id.nurse_patient_title);
        }
    }


    public NursePatientAdapter(List<String> patientList) {
        this.patientList = patientList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_nurse_patient_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        String chatItem = patientList.get(position);
        MyViewHolder myViewHolder = (MyViewHolder)viewHolder;
        myViewHolder.nursePatientTitleTextView.setText(chatItem);
    }




    @Override
    public int getItemCount() {
        return patientList.size();
    }
}
