package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView v,v1,v2;
ImageView i1;
int i;
    int[] img;
    String[] titles;
    String[] version;
    String[] date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        v=findViewById(R.id.text);
        Intent intent=getIntent();
        i=intent.getIntExtra("no",0);
        titles=getResources().getStringArray(R.array.Image_Titiles);
        version=getResources().getStringArray(R.array.Image_Versions);
        date=getResources().getStringArray(R.array.Date);
        img=new int[]{R.drawable.icecream,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,
                R.drawable.marsh,R.drawable.nougat,R.drawable.oreo,R.drawable.pie,
                R.drawable.an10
        };
        i1=findViewById(R.id.img);
        v1=findViewById(R.id.text1);
        v2=findViewById(R.id.text2);
        i1.setImageResource(img[i]);
        v.setText(titles[i]);
        v1.setText(version[i]);
        v2.setText(date[i]);

    }
}