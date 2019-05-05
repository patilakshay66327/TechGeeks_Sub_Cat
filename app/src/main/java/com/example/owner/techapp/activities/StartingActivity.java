package com.example.owner.techapp.activities;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.widget.Button;

import com.example.owner.techapp.R;
import com.example.owner.techapp.adapter.StartingAdapdter;

public class StartingActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    String[] data = {"java","CPP","C","Phython"};
    Button addData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        addData = findViewById(R.id.addData);

        recyclerView = (RecyclerView) findViewById(R.id.Starting_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new StartingAdapdter(this, data));


    }

}
