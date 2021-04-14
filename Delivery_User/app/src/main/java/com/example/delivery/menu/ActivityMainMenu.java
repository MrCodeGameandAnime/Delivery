package com.example.delivery.menu;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.delivery.R;
import com.example.delivery.adpter.MenuRecyclerView;
import com.example.delivery.model.Store;
import java.util.ArrayList;
import java.util.List;

public class ActivityMainMenu extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Store> storeList;
    MenuRecyclerView menuRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        recyclerView = findViewById(R.id.mainMenuRecyclerView);
        storeList = new ArrayList<>();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // passing data to model class
        for (int i=0; i<=10; i++){

            Store storeOne = new Store();
            storeOne.setStoreName("store " +i);
            storeOne.setStoreLocation("auburn");
            storeList.add(storeOne);
        }

        menuRecyclerView = new MenuRecyclerView(storeList);
        recyclerView.setAdapter(menuRecyclerView);
    }

    // TODO create RecyclerView to display stores for users to choose from
    // TODO go to the activity for the chosen store
    // TODO display options and amounts from the store
    // TODO place order from the app
    // TODO order is sent over to store
    // TODO drivers are notified of impending delivery and dispatched
    // TODO driver picks up order
    // TODO driver delivers order
    // TODO receipt is sent to driver phone, customer, and server
    // TODO order complete and driver is free to do another
}