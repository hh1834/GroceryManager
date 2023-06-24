package com.project.grocerymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    GroceryAdapter adapter;
    ArrayList<GroceryModel> groceryModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1) AdapterView
        listView = findViewById(R.id.listView);

        // 2) Data Source
        groceryModels = new ArrayList<>(); // fill with static data for now
        groceryModels.add(new GroceryModel("Bread", new Date(), R.drawable.bread));
        groceryModels.add(new GroceryModel("Milk", new Date(), R.drawable.milk));
        groceryModels.add(new GroceryModel("Eggs", new Date(), R.drawable.eggs));
        groceryModels.add(new GroceryModel("Pork", new Date(), R.drawable.pork));

        // 3) Adapter
        adapter = new GroceryAdapter(groceryModels, getApplicationContext());
        listView.setAdapter(adapter);
    }
}