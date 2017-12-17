package com.example.ishpreetkaur.horizontallistdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.RecyclerViewHolder>
{

    String[] name,version;

    public CustomAdapter(String[] name ,String[] version) {

        this.name =  name;
        this.version = version;

    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tx_version.setText(version[position]);
        holder.tx_name.setText(name[position]);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tx_name, tx_version;


        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tx_version = (TextView) itemView.findViewById(R.id.name);
            tx_name = (TextView) itemView.findViewById(R.id.type);
        }
    }
}
