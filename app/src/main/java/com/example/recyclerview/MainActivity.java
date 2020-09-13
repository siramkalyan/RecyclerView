package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    int[] img;
    String[] titles;
    String[] version;
    String[] date;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.recyclerview);
        titles=getResources().getStringArray(R.array.Image_Titiles);
        version=getResources().getStringArray(R.array.Image_Versions);
        date=getResources().getStringArray(R.array.Date);
        img=new int[]{R.drawable.icecream,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,
                R.drawable.marsh,R.drawable.nougat,R.drawable.oreo,R.drawable.pie,
                R.drawable.an10
        };
        adapter=new MyAdapter(this,titles,img,version,date,new CustomItemClickLitstener(){

            @Override
            public void onItemClick(View v, int position) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("no",position);
                startActivity(i);
            }


        });
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
    }

}