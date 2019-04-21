package com.android.riversideproject.adapter;

import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.riversideproject.R;

import java.util.List;

public class DriverChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView chatTitle;

        public MyViewHolder(View view) {
            super(view);
            chatTitle = (TextView) view.findViewById(R.id.chat_title);
        }
    }


    public DriverChatAdapter(List<String> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_driver_chat, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        String chatItem = moviesList.get(position);
        MyViewHolder myViewHolder = (MyViewHolder)viewHolder;
        myViewHolder.chatTitle.setText(chatItem);
    }




    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
