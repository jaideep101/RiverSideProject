package com.android.riversideproject.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.riversideproject.R;

import java.util.List;

public class DriverCompletePickupAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> driverCompletePickupList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView chatTitle;

        public MyViewHolder(View view) {
            super(view);
            chatTitle = (TextView) view.findViewById(R.id.complete_pickup_title);
        }
    }


    public DriverCompletePickupAdapter(List<String> moviesList) {
        this.driverCompletePickupList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_driver_complete_pickup, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        String chatItem = driverCompletePickupList.get(position);
        MyViewHolder myViewHolder = (MyViewHolder)viewHolder;
        myViewHolder.chatTitle.setText(chatItem);
    }




    @Override
    public int getItemCount() {
        return driverCompletePickupList.size();
    }
}
