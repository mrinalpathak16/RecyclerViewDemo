package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyRecyclerAdapter.OnRecyclerItemClick {
    RecyclerView recyclerView;
    List<ModelNew> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<>();
        data.add(new ModelNew(0, "Hi, How are you?"));
        data.add(new ModelNew(0, "Hi, How are you?"));
        data.add(new ModelNew(2, "Hi, How are you?"));
        data.add(new ModelNew(0, "Hi, How are you?"));
        data.add(new ModelNew(1, "Hi, How are you?"));
        data.add(new ModelNew(1, "Hi, How are you?"));
        data.add(new ModelNew(2, "Hi, How are you?"));
        data.add(new ModelNew(0, "Hi, How are you?"));
        data.add(new ModelNew(2, "Hi, How are you?"));
        data.add(new ModelNew(2, "Hi, How are you?"));
        data.add(new ModelNew(1, "Hi, How are you?"));
        data.add(new ModelNew(0, "Hi, How are you?"));
        data.add(new ModelNew(1, "Hi, How are you?"));

        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new HeteroAdapter(this, data));
    }

    @Override
    public void onItemClicked(int pos) {
//        Toast.makeText(this, data.get(pos).getName(), Toast.LENGTH_SHORT).show();
    }
}