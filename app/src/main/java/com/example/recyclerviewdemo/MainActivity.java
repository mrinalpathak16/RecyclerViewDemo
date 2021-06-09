package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Presentation;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerviewdemo.databinding.ActivityMainBinding;
import com.example.recyclerviewdemo.databinding.SampleLayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyRecyclerAdapter.OnRecyclerItemClick {
    ActivityMainBinding activityMainBinding;
    List<ModelNew> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        data = new ArrayList<>();
        data.add(new ModelNew(0, "Hi, How are you?",View.VISIBLE));
        data.add(new ModelNew(0, "Hi, How are you?",View.GONE));
        data.add(new ModelNew(2, "Hi, How are you?",View.VISIBLE));
        data.add(new ModelNew(0, "Hi, How are you?",View.GONE));
        data.add(new ModelNew(1, "Hi, How are you?",View.VISIBLE));
        data.add(new ModelNew(1, "Hi, How are you?",View.VISIBLE));
        data.add(new ModelNew(2, "Hi, How are you?",View.VISIBLE));
        data.add(new ModelNew(0, "Hi, How are you?",View.GONE));
        data.add(new ModelNew(2, "Hi, How are you?",View.VISIBLE));
        data.add(new ModelNew(2, "Hi, How are you?",View.GONE));
        data.add(new ModelNew(1, "Hi, How are you?",View.VISIBLE));
        data.add(new ModelNew(0, "Hi, How are you?",View.GONE));
        data.add(new ModelNew(1, "Hi, How are you?",View.VISIBLE));

        activityMainBinding.rv.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.rv.setAdapter(new HeteroAdapter( data));
//        activityMainBinding.textId.
    }

    @Override
    public void onItemClicked(int pos) {
//        Toast.makeText(this, data.get(pos).getName(), Toast.LENGTH_SHORT).show();
    }

    public void click(View view){

    }
}