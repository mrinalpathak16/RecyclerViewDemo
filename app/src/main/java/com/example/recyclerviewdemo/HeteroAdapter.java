package com.example.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.databinding.ListItemOneBinding;
import com.example.recyclerviewdemo.databinding.ListItemThreeBinding;
import com.example.recyclerviewdemo.databinding.ListItemTwoBinding;

import java.util.List;

public class HeteroAdapter extends RecyclerView.Adapter {
    private List<ModelNew> data;

    public HeteroAdapter(List<ModelNew> data) {
        this.data = data;
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getType();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        if(viewType==0){
            ListItemOneBinding listItemOneBinding = ListItemOneBinding.inflate(layoutInflater,parent,false);
            return new TextHolder(listItemOneBinding);
        }
        else if(viewType==1){
            ListItemTwoBinding listItemTwoBinding = ListItemTwoBinding.inflate(layoutInflater,parent,false);
            return new ImageHolder(listItemTwoBinding);
        }
        else {
            ListItemThreeBinding listItemThreeBinding = ListItemThreeBinding.inflate(layoutInflater,parent,false);
            return new AudioHolder(listItemThreeBinding);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof TextHolder){
            TextHolder textHolder = (TextHolder) holder;
            textHolder.listItemOneBinding.setItem(data.get(position));
        }
        else if(holder instanceof ImageHolder){
            ImageHolder imageHolder = (ImageHolder)holder;
            imageHolder.listItemTwoBinding.setItem(data.get(position));
        }
        else {
            AudioHolder audioHolder = (AudioHolder)holder;
            audioHolder.listItemThreeBinding.setItem(data.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class TextHolder extends RecyclerView.ViewHolder{
        ListItemOneBinding listItemOneBinding;
        public TextHolder(@NonNull ListItemOneBinding listItemOneBinding) {
            super(listItemOneBinding.getRoot());
            this.listItemOneBinding = listItemOneBinding;
        }
    }

    public class ImageHolder extends RecyclerView.ViewHolder{
        ListItemTwoBinding listItemTwoBinding;
        public ImageHolder(@NonNull ListItemTwoBinding listItemTwoBinding) {
            super(listItemTwoBinding.getRoot());
            this.listItemTwoBinding = listItemTwoBinding;
        }
    }

    public class AudioHolder extends RecyclerView.ViewHolder{
        ListItemThreeBinding listItemThreeBinding;
        public AudioHolder(@NonNull ListItemThreeBinding listItemThreeBinding) {
            super(listItemThreeBinding.getRoot());
            this.listItemThreeBinding = listItemThreeBinding;
        }
    }
}
