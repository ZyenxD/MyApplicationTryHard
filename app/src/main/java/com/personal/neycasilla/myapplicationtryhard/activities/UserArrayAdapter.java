package com.personal.neycasilla.myapplicationtryhard.activities;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.personal.neycasilla.myapplicationtryhard.R;
import com.personal.neycasilla.myapplicationtryhard.models.User;

import java.util.ArrayList;

/**
 * Created by Ney Casilla on 7/7/2018.
 */

public class UserArrayAdapter extends ArrayAdapter<User> {

    public UserArrayAdapter(Context context,ArrayList<User> arrayList){
        super(context,0,arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        User user = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user,parent,false);
        }
        TextView nameTextView = (TextView)convertView.findViewById(R.id.text1);
        TextView adrTextView = (TextView)convertView.findViewById(R.id.text2);
        nameTextView.setText(user.name);
        adrTextView.setText(user.address);
        return convertView;
    }
}
