package com.example.delivery.adpter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuRecyclerView extends RecyclerView.Adapter<MenuRecyclerView.MenuViewHolder> {

    @NonNull
    @Override
    public MenuRecyclerView.MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuRecyclerView.MenuViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
