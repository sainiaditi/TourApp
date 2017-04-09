package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RanthamboreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        TextView text = (TextView) findViewById(R.id.places);
        text.setText(R.string.visitRanthambore);

        final ArrayList<word> Word = new ArrayList<word>();

        Word.add(new word(R.drawable.r1,getString(R.string.r1)));
        Word.add(new word(R.drawable.r2,getString(R.string.r2)));
        Word.add(new word(R.drawable.r3,getString(R.string.r3)));
        Word.add(new word(R.drawable.r4,getString(R.string.r4)));
        Word.add(new word(R.drawable.r5,getString(R.string.r5)));
        Word.add(new word(R.drawable.r6,getString(R.string.r6)));
        Word.add(new word(R.drawable.r7,getString(R.string.r7)));

        WordAdapter adapter = new WordAdapter(this,Word,R.color.ajmer);

        ListView listview = (ListView) findViewById(R.id.list_in);

        listview.setAdapter(adapter);
    }
}
