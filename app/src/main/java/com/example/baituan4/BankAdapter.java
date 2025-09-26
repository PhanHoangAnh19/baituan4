package com.example.baituan4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BankAdapter extends RecyclerView.Adapter<BankAdapter.ViewHolder> {

    // Danh sách bank (mảng String)
    private final String[] data;
    // Callback khi click
    private final OnBankClickListener listener;

    // Interface callback
    public interface OnBankClickListener {
        void onClick(String bankName);
    }

    // Constructor
    public BankAdapter(String[] data, OnBankClickListener listener) {
        this.data = data;
        this.listener = listener;
    }

    // ViewHolder class
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvBankName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBankName = itemView.findViewById(R.id.tvBankName);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_bank, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String bankName = data[position];
        holder.tvBankName.setText(bankName);
        holder.itemView.setOnClickListener(v -> listener.onClick(bankName));
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
