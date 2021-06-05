package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;

import java.util.List;

public class HeteroAdapter extends RecyclerView.Adapter {
    private Context mContext;
    private List<ModelNew> data;

    public HeteroAdapter(Context mContext, List<ModelNew> data) {
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getType();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType==0){
            return new TextHolder(
                    LayoutInflater.from(mContext).inflate(R.layout.list_item_one, parent, false)
            );
        }
        else if(viewType==1){
            return new ImageHolder(
                    LayoutInflater.from(mContext).inflate(R.layout.list_item_two, parent, false)
            );
        }
        else {
            return new AudioHolder(
                    LayoutInflater.from(mContext).inflate(R.layout.list_item_three, parent, false)
            );
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof TextHolder){
            TextHolder textHolder = (TextHolder)holder;
            textHolder.msg.setText(data.get(position).getMessage());
        }
        else if(holder instanceof ImageHolder){
            ImageHolder imageHolder = (ImageHolder)holder;
            imageHolder.msg.setText(data.get(position).getMessage());
        }
        else {
            AudioHolder audioHolder = (AudioHolder)holder;
            audioHolder.msg.setText(data.get(position).getMessage());
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class TextHolder extends RecyclerView.ViewHolder{
        TextView msg, sno;
        public TextHolder(@NonNull View itemView) {
            super(itemView);
            msg = itemView.findViewById(R.id.msg);
            sno = itemView.findViewById(R.id.sno);
        }
    }

    public class ImageHolder extends RecyclerView.ViewHolder{
        ImageView img; TextView msg;
        public ImageHolder(@NonNull View itemView) {
            super(itemView);
            msg = itemView.findViewById(R.id.textView);
            img = itemView.findViewById(R.id.imageView);
        }
    }

    public class AudioHolder extends RecyclerView.ViewHolder{
        MaterialButton play; TextView msg;
        public AudioHolder(@NonNull View itemView) {
            super(itemView);
            msg = itemView.findViewById(R.id.a_cap);
            play = itemView.findViewById(R.id.play);
        }
    }
}
