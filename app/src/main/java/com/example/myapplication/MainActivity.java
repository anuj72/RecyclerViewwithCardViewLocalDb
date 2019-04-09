package com.example.myapplication;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItems> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =(RecyclerView)findViewById(R.id.rv);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.hasFixedSize();

        listItems = new ArrayList<>();
        int i;
        for(i=0;i<=10;i++){
            ListItems li = new ListItems("anuj"+i);
            listItems.add(li);
        }
            adapter = new MyAdapter(listItems,this);
            recyclerView.setAdapter(adapter);
    }
}
