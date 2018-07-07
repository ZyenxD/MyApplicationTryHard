package com.personal.neycasilla.myapplicationtryhard.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.personal.neycasilla.myapplicationtryhard.R;
import com.personal.neycasilla.myapplicationtryhard.models.User;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList userArrayList = new ArrayList<User>();

        for (int i=0;i<100;i++){
            User u = new User("jake "+i,"case "+i);
            userArrayList.add(u);
        }

        UserArrayAdapter arrayAdapter = new UserArrayAdapter(this,userArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }
}
