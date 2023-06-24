package com.project.grocerymanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class GroceryAdapter extends ArrayAdapter<GroceryModel> {
    ArrayList<GroceryModel> groceryList;
    Context context;

    public GroceryAdapter(ArrayList<GroceryModel> groceryList, Context context) {
        super(context, R.layout.grocery_item, groceryList);
        this.groceryList = groceryList;
        this.context = context;
    }

    // View Lookup Cache
    private static class ViewHolder {
        TextView txtName;
        TextView txtExpirationDate;
        ImageView flagImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the data item for this position
        GroceryModel groceryModel = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grocery_item, parent, false);

            viewHolder.txtName = (TextView) convertView.findViewById(R.id.groceryName);
            viewHolder.txtExpirationDate = (TextView) convertView.findViewById(R.id.expirationDate);
            viewHolder.flagImg = (ImageView) convertView.findViewById(R.id.groceryImage);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // Get the data from the model class
        viewHolder.txtName.setText(groceryModel.getName());
        viewHolder.txtExpirationDate.setText(groceryModel.getExpirationDate().toString());
        viewHolder.flagImg.setImageResource(groceryModel.getImage());

        return convertView;
    }
}
