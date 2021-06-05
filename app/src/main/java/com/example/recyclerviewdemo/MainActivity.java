package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ModelUser> data = new ArrayList<>();
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
        recyclerView.setAdapter(new MyRecyclerAdapter(data, this));
    }
}