package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static android.R.attr.id;
import static com.example.android.tourguideapp.R.*;
import static com.example.android.tourguideapp.R.string.*;

public class UdaipurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(layout.list);

        TextView text = (TextView) findViewById(R.id.places);
        text.setText(visitUdaipur);

        final ArrayList<word> Word = new ArrayList<word>();

        Word.add(new word(getString(string.u1)));
        Word.add(new word(getString(string.u2)));
        Word.add(new word(getString(string.u3)));
        Word.add(new word(getString(string.u4)));
        Word.add(new word(getString(string.u5)));
        Word.add(new word(getString(string.u6)));
        Word.add(new word(getString(string.u7)));
        Word.add(new word(getString(string.u8)));
        Word.add(new word(getString(string.u9)));
        Word.add(new word(getString(string.u10)));
        Word.add(new word(getString(string.u11)));
        Word.add(new word(getString(string.u12)));
        Word.add(new word(getString(string.u13)));
        Word.add(new word(getString(string.u14)));

        WordAdapter adapter = new WordAdapter(this,Word, color.udaipur);

        ListView listview = (ListView) findViewById(R.id.list_in);

        listview.setAdapter(adapter);
    }
}
