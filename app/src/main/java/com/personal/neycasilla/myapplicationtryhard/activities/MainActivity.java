package com.personal.neycasilla.myapplicationtryhard.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.personal.neycasilla.myapplicationtryhard.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linearVerticalButton = (Button) findViewById(R.id.linearLayoutVertical);
        Button tableButton = (Button) findViewById(R.id.tableLayout);
        Button listButton = (Button) findViewById(R.id.listViewButton);

        listButton.setOnClickListener(this);
        linearVerticalButton.setOnClickListener(this);
        tableButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.linearLayoutVertical:
                 intent = new Intent(this,LinearActivity.class);
                startActivity(intent);
                break;
            case R.id.tableLayout:
                intent = new Intent(this,tableActivity.class);
                startActivity(intent);
                break;

            case R.id.listViewButton:
                intent = new Intent(this,ListActivity.class);
                startActivity(intent);
                break;

        }
    }
}
