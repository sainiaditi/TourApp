package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class JaipurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list);

        TextView text = (TextView) findViewById(R.id.places);
        text.setText(R.string.visitJaipur);

        final ArrayList<word> Word = new ArrayList<word>();

        Word.add(new word(getString(R.string.j1)));
        Word.add(new word(getString(R.string.j2)));
        Word.add(new word(getString(R.string.j3)));
        Word.add(new word(getString(R.string.j4)));
        Word.add(new word(getString(R.string.j5)));
        Word.add(new word(getString(R.string.j6)));
        Word.add(new word(getString(R.string.j7)));
        Word.add(new word(getString(R.string.j8)));
        Word.add(new word(getString(R.string.j9)));
        Word.add(new word(getString(R.string.j10)));
        Word.add(new word(getString(R.string.j11)));
        Word.add(new word(getString(R.string.j12)));
        Word.add(new word(getString(R.string.j13)));
        Word.add(new word(getString(R.string.j14)));

        WordAdapter adapter = new WordAdapter(this,Word,R.color.jaipur);

        ListView listview = (ListView) findViewById(R.id.list_in);

        listview.setAdapter(adapter);
    }
}
