package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView udaipur = (TextView) findViewById(R.id.udaipur);

        udaipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent udaipurIntent = new Intent(MainActivity.this, UdaipurActivity.class);

                startActivity(udaipurIntent);
            }
        });

        TextView jaipur = (TextView) findViewById(R.id.jaipur);

        jaipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jaipurActivity = new Intent(MainActivity.this , JaipurActivity.class);
                startActivity(jaipurActivity);
            }
        });

        TextView ajmer = (TextView) findViewById(R.id.ajmer);

        ajmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajmerActivity = new Intent(MainActivity.this , AjmerActivity.class);
                startActivity(ajmerActivity);
            }
        });

        TextView ranthambore = (TextView) findViewById(R.id.ranthambore);

        ranthambore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ranthamboreActivity = new Intent(MainActivity.this ,RanthamboreActivity.class);
                startActivity(ranthamboreActivity);
            }
        });
    }
}
