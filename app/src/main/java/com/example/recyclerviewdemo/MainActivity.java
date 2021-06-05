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
    List<ModelUser> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<>();
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Dhruv Walia", "012388989", "26/11/2000"));
        data.add(new ModelUser("Bhavesh Sharma", "017786789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));
        data.add(new ModelUser("Mrinal Pathak", "0123456789", "26/11/2000"));

        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(data, this);
        adapter.setOnRecyclerItemClick(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClicked(int pos) {
        Toast.makeText(this, data.get(pos).getName(), Toast.LENGTH_SHORT).show();
    }
}