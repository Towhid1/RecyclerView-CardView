package com.example.hpelitbook.practice;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HP ElitBook on 9/17/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.DataViewHolder> {

    List<Data> dataList;

    RecyclerViewAdapter(List<Data> list){
        this.dataList=list;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview1,parent,false);
        DataViewHolder dataViewHolder= new DataViewHolder(view);
        return dataViewHolder;
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        holder.imageView.setImageResource(dataList.get(position).photo);
        holder.title.setText(dataList.get(position).title);
        holder.about.setText(dataList.get(position).about);


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title,about;
        CardView cardView;

        public DataViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView) itemView.findViewById(R.id.cardview1);
            imageView =(ImageView) itemView.findViewById(R.id.photo);
            title=(TextView) itemView.findViewById(R.id.title);
            about=(TextView) itemView.findViewById(R.id.about);
        }



    }
}
