package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    int[] img;
    String[] titles;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.recyclerview);
        titles=getResources().getStringArray(R.array.Image_Titiles);
        img=new int[]{R.drawable.sagi1,R.drawable.sagi2,R.drawable.sagi3,R.drawable.sagi4,
                R.drawable.sagi5,R.drawable.sagi11,R.drawable.sagi21,R.drawable.sagi31,
                R.drawable.sagi41,R.drawable.sagi51
        };
        adapter=new MyAdapter(this,titles,img);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);

        /*5 tasks */
        /* Task :- Replace Images and Titles with android names , API Level , Release Date*/



    }
}