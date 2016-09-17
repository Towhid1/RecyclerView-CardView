package com.example.hpelitbook.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Data> dataList;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataList = new ArrayList<>();
        dataList.add(new Data("Picture one","yes! it is one.",R.drawable.p1));
        dataList.add(new Data("Picture two","yes! it is two.",R.drawable.p2));
        dataList.add(new Data("Picture three","yes! it is three.",R.drawable.p3));
        dataList.add(new Data("Picture four","yes! it is four.",R.drawable.p4));
        dataList.add(new Data("Picture five","yes! it is five.",R.drawable.p5));
        dataList.add(new Data("Picture six","yes! it is six.",R.drawable.p3));
        dataList.add(new Data("Picture seven","yes! Seven is a great movie.",R.drawable.p1));

        recyclerView=(RecyclerView)findViewById(R.id.recyclerViewMain);
        layoutManager =new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter =new RecyclerViewAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }
}
