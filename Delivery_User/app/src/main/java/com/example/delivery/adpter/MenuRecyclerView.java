package com.example.delivery.adpter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.delivery.R;
import com.example.delivery.model.Store;
import java.util.List;

public class MenuRecyclerView extends RecyclerView.Adapter<MenuRecyclerView.MenuViewHolder> {

    private List<Store> storeList;

    public MenuRecyclerView(List<Store> storeList) {
        this.storeList = storeList;
    }


    @NonNull
    @Override
    public MenuRecyclerView.MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // fill the main_menu layout to get a view
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.main_menu_store_list_rv,parent,false
        );
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuRecyclerView.MenuViewHolder holder, int position) {
        // set data from model to view
        holder.menuTitle.setText(storeList.get(position).getStoreName());
        holder.menuLocation.setText(storeList.get(position).getStoreLocation());
    }

    @Override
    public int getItemCount() {
        return storeList.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {

        TextView menuTitle;
        TextView menuLocation;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            // access menu layout widgets
            menuTitle = itemView.findViewById(R.id.mainMenuStoreTitle);
            menuLocation = itemView.findViewById(R.id.mainMenuStoreLocation);
        }
    }
}
