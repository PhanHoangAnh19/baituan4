package com.example.baituan4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SimpleStringAdapter extends RecyclerView.Adapter<SimpleStringAdapter.VH> {
    private final String[] data;
    public SimpleStringAdapter(String[] data){ this.data = data; }

    static class VH extends RecyclerView.ViewHolder {
        TextView tv;
        VH(@NonNull View itemView){ super(itemView); tv = itemView.findViewById(R.id.tvText); }
    }
    @NonNull @Override public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_text, parent, false);
        return new VH(v);
    }
    @Override public void onBindViewHolder(@NonNull VH h, int pos){ h.tv.setText(data[pos]); }
    @Override public int getItemCount(){ return data.length; }
}
