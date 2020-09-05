package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context ctx;
    String titles[];
    int images[];
    String version[];
    String date[];

    public MyAdapter(Context ctx, String[] titles, int[] images,String[] version,String[] date) {
        this.ctx = ctx;
        this.titles = titles;
        this.images = images;
        this.version=version;
        this.date=date;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(ctx)
                .inflate(R.layout.every_row_design,parent,false));
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.img.setImageResource(images[position]);
        holder.txt.setText(titles[position]);
        holder.txt1.setText(version[position]);
        holder.txt2.setText(date[position]);

    }
    @Override
    public int getItemCount() {
        return titles.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt,txt1,txt2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img_view);
            txt=itemView.findViewById(R.id.text_view);
            txt1=itemView.findViewById(R.id.text_view1);
            txt2=itemView.findViewById(R.id.text_view2);

        }
    }

}
