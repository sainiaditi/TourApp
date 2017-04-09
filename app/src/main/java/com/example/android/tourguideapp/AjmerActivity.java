package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AjmerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        TextView text = (TextView) findViewById(R.id.places);
        text.setText(R.string.visitAjmer);

        final ArrayList<word> Word = new ArrayList<word>();

        Word.add(new word(getString(R.string.a1)));
        Word.add(new word(getString(R.string.a2)));
        Word.add(new word(getString(R.string.a3)));
        Word.add(new word(getString(R.string.a4)));
        Word.add(new word(getString(R.string.a5)));
        Word.add(new word(getString(R.string.a6)));
        Word.add(new word(getString(R.string.a7)));
        Word.add(new word(getString(R.string.a8)));
        Word.add(new word(getString(R.string.a9)));
        Word.add(new word(getString(R.string.a10)));
        Word.add(new word(getString(R.string.a11)));
        Word.add(new word(getString(R.string.a12)));
        Word.add(new word(getString(R.string.a13)));
        Word.add(new word(getString(R.string.a14)));

        WordAdapter adapter = new WordAdapter(this,Word,R.color.ajmer);

        ListView listview = (ListView) findViewById(R.id.list_in);

        listview.setAdapter(adapter);
    }
}
